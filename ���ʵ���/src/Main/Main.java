package Main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
public static void main(String[] args){
	int count = 0;
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String[] arry = new String[str.length()];
	StringBuffer sb = new StringBuffer();
	Matcher m = Pattern.compile("\\w+").matcher(str);
	while(m.find()){
		arry[count] = m.group();
		count++;
	}
	for(int i=0;i < count; i++){
		sb.append(new StringBuffer(arry[i]).reverse()); //���������ȷ�תam��Ϊma
		if(i!=count-1)  sb.append(" "); //�����뵥��֮��ӿո�
		}
		sb.reverse();//�������ַ������з�ת��
	System.out.print(sb);
	sc.close();
}
}
