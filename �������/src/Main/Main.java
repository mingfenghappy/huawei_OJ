package Main;

import java.util.Scanner;

public class Main {
	public static int run(int x){  
		   
		 if(x<=2){//ǰ����ֱ�ӷ���-1  
		     return -1;  
		 }else if(x%2 == 1){//�����е�һ������ż��Ϊ2  
		     return 2;  
		 }  
		return x / 2 % 2 + 3;  
		}  
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int str = sc.nextInt();
		System.out.print(run(str));
		sc.close();
	}
}
