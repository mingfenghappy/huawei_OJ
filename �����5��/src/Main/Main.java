package Main;
/**
 * һ���������߶��������£�ÿ����غ�����ԭ�߶ȵ�һ��; 
 * ������, �����ڵ�5�����ʱ��������������?��5�η������
 */
import java.util.Scanner;

public class Main {
	public static double getJourney(double high)
    {
		double d = high*2+high/2+high/4+high/8;
        return d;
    }
	   public static double getTenthHigh(double high)
	    {
		   double d = high/32;
	        return d;
	    }
	   public static void main(String[] args){
		   Scanner sc = new Scanner(System.in);
		   double s = sc.nextDouble();
		   System.out.println(getJourney(s));
		   System.out.print(getTenthHigh(s));
		   sc.close();
	   }
}
