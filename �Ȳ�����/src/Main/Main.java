package Main;
/**
 * �Ȳ����� 2��5��8��11��14����������ǰN��֮�͡�
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	int str = sc.nextInt();
	int[] arry = new int[str];
	for(int i = 0;i < arry.length;i++){
		arry[i] = 2+3*i;                  //���Ȳ����и�ֵ����������
	}
	for(int i = 0;i < arry.length;i++){
		sum += arry[i];           //����ǰN�����
	}
	System.out.print(sum);
	sc.close();
}
}
