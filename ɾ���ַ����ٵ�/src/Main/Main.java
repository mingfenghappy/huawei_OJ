package Main;
/**
 * ɾ���ַ����г��ִ������ٵ��ַ�
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int[] arry = new int[1000];
	   Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   char[] arry1 = str.toCharArray();  //������浱�����
	   StringBuilder sb= new StringBuilder();  //���ڴ�������ַ���
	   int num = 0;
	   int temp;
	   int temp1;
	   int min = 20;
	   if(str.length() > 20){
		   System.out.print("�ַ�������20");
	   }
	   else{
	   for(int i = 0 ;i < str.length() ;i++){    
		   for(int j = 0; j <str.length();j++){
			   temp = str.charAt(i);
			   temp1 = str.charAt(j);
			   if(temp == temp1){
				   num++;      //���ظ���
			   }
		   }
		   arry[i] = num;
		   if(num < min){   //�ҳ���С�ĸ���ֵ
			   min = num;       
		   }
		   num = 0;
	   }
	   for(int i = 0 ;i < str.length() ;i++){
		   if(arry[i] != min){    //�ҳ�Ԫ�ظ���������С����Щ
			   sb.append(arry1[i]);  //��ӵ�sb��
		   }
	   }
	   System.out.print(sb);
	   sc.close();
	}
	}
}
