package Main;
/*
 * ���ַ�����ASCII��С��������
 */
import java.util.Scanner;
import java.util.Arrays;
public class Main {
public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   if(str.length()>1024){
		   System.out.print("������Χ");
	   }
	   else{
	   char[] arry = str.toCharArray();
	   Arrays.sort(arry);
	   System.out.print(String.valueOf(arry));
	   }
	   sc.close();
}
}
