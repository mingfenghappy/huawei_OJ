package Main;
import java.util.Scanner;
public class Main {
  public void Continumax(String str,StringBuffer outputStr){
	  String[] st = str.split("[^0-9]{1,}");    //^[0-9]{1,}������һ�������ֵ��ַ���
	  int temp = 0;
      for(String s: st)
          if(s.length() >= temp)    //ͨ���Ƚϣ����ս���ĸ���temp1
          {
              temp = s.length();
              outputStr.replace(0,temp,s);   
             // outputStr.replace(0,temp,s);
          }
      System.out.print(outputStr.toString()+","+outputStr.length());
  }
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer outputStr = new StringBuffer();
		Main mi = new Main();
		mi.Continumax(str,outputStr);
		sc.close();
  }
}
