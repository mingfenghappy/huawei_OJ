package Main;
/**
 * ���ͳ�Ƶĸ�����ͬ������ASII����С����������� ������������ַ��������Щ�ַ����ý���ͳ�ơ�
    ����һ���ַ��������ַ��еĸ���Ӣ���ַ������֣��ո����ͳ�ƣ��ɷ������ã�
    ����ͳ�Ƹ����ɶൽ�����ͳ�ƽ�������ͳ�Ƶĸ�����ͬ������ASII����С�����������
    aadddccddc-----dca
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] ss = str.toCharArray();
		int[] num = new int[ss.length];
		int[] weizhi = new int[ss.length];
		int count = 0;	
		for(int i=0;i<ss.length;i++)
		{
			if((ss[i]>='A'&&ss[i]<='Z')||(ss[i]>='a'&&ss[i]<='z')||(ss[i]>='0'&&ss[i]<='9')||(ss[i]==' '))
			{
				for(int j=0;j<ss.length;j++)
				{
					if(ss[i] == ss[j])
						count++;
				}

				num[i] = count;   //����ڸ��ַ�����
				weizhi[i] = i;   //��¼����¼��λ��
				count=0;
			}
			else{
				continue;
			}
		}
//		System.out.print(ss.length+" "+num.length);
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j])       //���ַ��������������������ǰ
				{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					char xx = ss[i];
					ss[i] = ss[j];
					ss[j] = xx;
				}else if(num[i] == num[j])    //��ͬ�����ıȽ�ASII
				{
					if(ss[i]>ss[j])
					{
						int temp = num[i];
						num[i] = num[j];
						num[j] = temp;
						char xx = ss[i];
						ss[i] = ss[j];
						ss[j] = xx;
					}
				}
			}
		}
		ArrayList<Character> countlist = new ArrayList<Character>();
		for(int i=0;i<num.length;i++) 
		{
			if(!countlist.contains(ss[i]))
			{
				countlist.add(ss[i]);   //��˳��װ��
			}
		}
		for(int i=0;i<countlist.size();i++)
		{
			System.out.print(countlist.get(i));
		}
		sc.close();

}  
}

