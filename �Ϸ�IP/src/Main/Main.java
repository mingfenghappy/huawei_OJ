package Main;
/**
 * �ж�һ��IP�Ƿ�Ϸ��������YES�����Ϸ����NO
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	int num = 0;
	int count = 0;
	 Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   char[] arry = str.toCharArray();
	   for(int i = 0;i < str.length();i++){
		   if (arry[i] != '.' && (arry[i]<'0'||arry[i]>'9')){ //������ĸ����NO
			   System.out.print("NO");
			   break;
		   }
		   else if(arry[i] == '.'){
			   num++;
		   }
	   }
	   if(num == 3){    //����3�������NO
	   String[] arry1 = str.split("\\.");  //Ip�ԡ��ָ�
	   for(int i = 0;i < arry1.length;i++){
		   if(arry1[i] == null){
			   System.out.print("NO");
		   } 
		   else if(Integer.valueOf(arry1[i]) > 0 && Integer.valueOf(arry1[i]) < 255){  //�ַ���0��255֮��
			   count++;
		   }
	   }
   if(count == 4){   //����ĸ���������������YES
		  System.out.print("YES");
	   }
   else if(count != 4){
	   System.out.print("NO");
   }
}
	   sc.close();
}
}
