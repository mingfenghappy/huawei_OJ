package Main;
/**
 * ����һ��ż��������2����������2��������ɣ����ż����2�������кܶ��������Ҫ��������ָ��ż��������������ֵ��С��������
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	int flag1 = 0;
	int flag2 = 0;
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	for(int i = a/2;i < a;i++){ //��a/2��ʼ�жϣ����жϳ���ֵ��С��
		flag1 = 0;
		flag2 = 0;
		for(int j = 2;j< Math.sqrt(i);j++ ){ //�ж�i�Ƿ�Ϊ���� 
			if(i%j == 0){
				flag1 = 1;
			}
			if((a-i)%j == 0){
				flag2 = 1;
			}
		}
		if(flag1 == 0 && flag2 == 0){
			System.out.println(a-i);
			System.out.print(i);
			break;
		}
	}
	sc.close();
}
}
