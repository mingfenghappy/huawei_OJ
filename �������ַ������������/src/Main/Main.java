package Main;
/**
 * ���������ַ���a,b�е�������Ӵ���
 */
import java.util.Scanner;

public class Main {
	public static String iQueryMaxCommString(String stringA, String stringB){
        String minStr = null;
        String maxStr = null;
		int sum = 0;
		int temp = 0;
		int max = 0;
		int flag = 0;
		if(stringA.length() < stringB.length()){   //�ֳ����ַ����нϳ��ͽ϶̵�
			minStr = stringA;
			maxStr = stringB;
		}
		else{
		   minStr = stringB;
		   maxStr = stringA;
		}
		for(int i = 0; i < minStr.length() ;i++){    //�Ӷ̴���ʼ�����������ͬ��
			for(int j = 0;j < maxStr.length();j++){  
				while((j+temp)<maxStr.length() && (i+temp)<minStr.length() && (minStr.charAt(i+temp) == maxStr.charAt(j+temp))){  //���ַ������1�Ƚ�ֱ��������ҷ��ʶ��ַ�������
					temp++;
					sum++;
					}
				if(max < sum){   //�ҳ����ͬ���ĳ���
					max = sum;
					flag = i;
				}
				sum = 0;
				temp = 0;
			}
		}
		return minStr.substring(flag,flag+max);
	}
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   String str = sc.nextLine();
	   String str1 = sc.nextLine(); 
	   System.out.print(iQueryMaxCommString(str,str1));
	   sc.close();
	}
}
