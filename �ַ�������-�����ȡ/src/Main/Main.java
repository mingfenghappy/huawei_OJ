package Main;
/**
 * ������Ч���봮����󳤶� ��ABBAΪ4��
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
	  int count = 0;
	  int flag = 0;
	  int max = 0;
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	 int[] array = new int[1000];
	// System.out.print(s);
	 if(str.length() == 1){
		 System.out.print("1");
	 }
	 else{
	   for(int i = 0;i < str.length()-2;i++){   //�ӵ�һ���ַ���ʼ������
		  for(int j =i+3 ;j <= str.length();j++){  //�ַ���������Ϊ3����3��ʼ������,
			  flag = 0;
			  String s =str.substring(i,j);  //��ȡ���ַ���
			  for(int k = 0;k < s.length()/2;k++){
				 if(s.charAt(k) != s.charAt(s.length()-k-1)){
					 flag = 1;
				 }
			  }
			  if(flag != 1){
				  array[count] = (j-i);
				  if(array[count] > max){
					  max = array[count];   //�������¼��
				  }
				  count++;
			  }  
		  }
  }
	   System.out.print(max);
	 }
	   sc.close();
  }
}


