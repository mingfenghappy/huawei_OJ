package Main;
import java.util.Scanner;
public class Main {
	public static int fun(int m,int n)  //m��ƻ������n�������й��м��ַ���
	{
     if(m==0||n==1)  //��Ϊ����������m>=n�����ģ�����m-n>=0,������m=0ʱ������������Ϊm=1��
	        return 1;    //����ܳ���m-n=0������Ӷ����ܵõ���ȷ��    
     if(n>m)
	         return fun(m,m);
	    else
         return fun(m,n-1)+fun(m-n,n);
	 }
	 
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int m = sc.nextInt();
		 int n = sc.nextInt();
		 System.out.print(fun(m,n));
		 sc.close();
		 
	 }
	 {

 }
}
