package Main;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
        String s = sc.nextLine();
		StringBuffer sb=new StringBuffer();
		String str[] = s.split(" ");
		for(int i=0; i<str.length; i++){
		sb.append(new StringBuffer(str[i]).reverse()); //���������ȷ�תam��Ϊma
		if(i!=str.length-1)  sb.append(" "); //�����뵥��֮��ӿո�
		}
		sb.reverse();//�������ַ������з�ת��
		System.out.print(sb);
		sc.close();
	    }
		}