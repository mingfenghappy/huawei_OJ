package Main;
/**
 * ѡȡ��С������G��C�����ַ�����
 */
import java.util.Scanner;
public class Main {
public static void main(String[] args){
   int temp = 0;
   int num = 0;
   int max = 0;
   int flag = 0;
   Scanner sc = new Scanner(System.in);
   String str = sc.nextLine();
   int str1 =sc.nextInt();
   for(int i = 0;i < str.length()-str1;i++){   //�ӵ�һ����ĸ��ʼ����len-str��
	   String str2 = str.substring(i,i+str1);   //��ȡ��С�����ַ���
	  for(int j = 0;j < str1;j++){
		  temp = str2.charAt(j);       //ȡ��Ҫ�Ƚ���ĸ
		  if(temp == 'G'||temp == 'C'){
		  num++;
	}
	  }
	  if(num > max){     //�����G��C��iֵ��¼��
		  max = num;
		  flag = i;
	  }
	  num = 0;
}
   System.out.print(str.substring(flag,flag+str1));
    sc.close();
	}
}
