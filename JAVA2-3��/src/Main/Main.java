package Main;
/**
 * ����n x m�����̸��ӣ�nΪ����ĸ�������mΪ����ĸ����������Ÿ��Ա�Ե�ߴ����Ͻ��ߵ����½ǣ��ܹ��ж������߷���
 * Ҫ�������Һ������ߣ����������������
 */
import java.util.Scanner;

public class Main {
	public int count(int m,int n)
	{	
	if((m==1 && n==0) || (m==0 && n==1))
	return 1;
	if(m>0 && n>0)
	return count(m-1,n)+ count(m,n-1);	//�ݹ����
	if(m==0)  //ֻ��һ�����
	return count(m,n-1);
	if(n==0)
	return count(m-1,n);
	return 0;
	}
	public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int m = sc.nextInt();
	 int n = sc.nextInt();
	 Main mi = new Main();
	 System.out.print(mi.count(m,n));
	 sc.close();
	}
}

