package Main;
/*
 * ���ڲ�ͬ���ַ���������ϣ�����а취�ж����Ƴ̶ȣ����Ƕ�����һ�ײ�������������������ͬ���ַ��������ͬ������Ĳ����������£�
1 �޸�һ���ַ�����ѡ�a���滻Ϊ��b����
2 ����һ���ַ�����ѡ�abdd����Ϊ��aebdd����
3 ɾ��һ���ַ�����ѡ�travelling����Ϊ��traveling����
���磬���ڡ�abcdefg���͡�abcdef�������ַ�����˵��������Ϊ����ͨ�����Ӻͼ���һ����g���ķ�ʽ���ﵽĿ�ġ���������ַ�������ֻ��Ҫһ�β������������������Ҫ�Ĵ�������Ϊ�����ַ����ľ��룬�����ƶȵ��ڡ����룫1���ĵ�����Ҳ����˵����abcdefg���͡�abcdef���ľ���Ϊ1�����ƶ�Ϊ1/2=0.5.
 */
import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s1 =sc.nextLine();
	String s2=sc.nextLine();
	int i = CalculateStringDistance(s1,0,s1.length()-1,s2,0,s2.length()-1)+1;//���ƶ�
	System.out.print("1/"+i);
}
public static int CalculateStringDistance(String strA, int pABegin, int pAEnd,    
		   String strB, int pBBegin, int pBEnd)     
		{    
		     if(pABegin > pAEnd)    
		     {    
		          if(pBBegin > pBEnd)    
		               return 0;     
		          else    
		     
		               return (pBEnd - pBBegin + 1);    
		     }    
		    
		     if(pBBegin > pBEnd)    
		     {    
		          if(pABegin > pAEnd)    
		               return 0;    
		          else    
		               return pAEnd - pABegin + 1;    
		     }    
		    
		     if(strA.charAt(pABegin) == strB.charAt(pBBegin))    
		     {    
		          return CalculateStringDistance(strA, pABegin + 1, pAEnd,    
		            strB, pBBegin + 1, pBEnd);    
		     }    
		     else    
		     {    
		          int t1 = CalculateStringDistance(strA, pABegin, pAEnd, strB,     
		            pBBegin + 1, pBEnd);    
		          int t2 = CalculateStringDistance(strA, pABegin + 1, pAEnd,     
		            strB,pBBegin, pBEnd);    
		          int t3 = CalculateStringDistance(strA, pABegin + 1, pAEnd,    
		            strB,pBBegin + 1, pBEnd);    
		          return min(t1,t2,t3) + 1;    
		     }    
		} 
public static int min(int a,int b,int c){
	int s = Math.min(a, b);
	int k = Math.min(s, c);
	return k;
}
}