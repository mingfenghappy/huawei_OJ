package Main;

import java.math.BigInteger;//����BigInteger�е�add�����������߳�����str��str1�ĺ�
import java.util.Scanner;

public class Main {
	public String AddLongInteger(String addend, String augend) {
		BigInteger a = new BigInteger(addend);
		BigInteger b = new BigInteger(augend);
		BigInteger c = a.add(b);
		return (String.valueOf(c));// ��BigIntegerתΪ�ַ�������
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str1 = sc.nextLine();// �����ַ���
		Main mi = new Main();
		System.out.print(mi.AddLongInteger(str, str1));
		sc.close();
	}
}
