package Main;
/**
 * ������������������ָһ������ƽ����β�����ڸ����������Ȼ��
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	int num = 0;
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
for(int i = 0;i <= s;i++){
	String str = String.valueOf(i);
	int sum = i*i;
	if(sum%(Math.pow(10,str.length())) == i){
		num++;
	}
}
System.out.print(num);
sc.close();
}
}
