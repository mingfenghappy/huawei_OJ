package Main;
/**
 * ���ξ�������1��ʼ����Ȼ���������гɵ�һ��������������
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int p = 1;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N <= 100){
		int[][] f = new int[N][N];
	for(int i=0;i<N;i++)
	{
	for(int j = i,k = 0;j >= 0 && k <= i;j--,k++)
	{
	f[j][k] = p;
	p += 1;
	}
	}
	for(int i = 0;i < N;i++)
	{
	for(int j = 0;j < N-i;j++){
		if(j != N-i-1){
	    System.out.print(f[i][j]+" ");
		}
		else if(j == N-i-1){
			System.out.print(f[i][j]);
		}
	}
     System.out.print('\n');
	}
		}
	sc.close();
}
}
