package Main;
import java.util.Arrays;
/**
 * ����һ�����룬����������ȣ��ֱ�Ϊm1��m2����mn�����ǿ�ȡ����������ֱ�Ϊx1��x2����xn������Ҫ����Щ����ȥ����������������ܳƳ������в�ͬ������
 * 2
   1
   2     -----   5
   2
   1
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    	int num = 0;
    	int count = 0;
    	int temp = 0;
    	int temp1 = 1;
    	int flag = 0;
    	int[] sum =new int[1000];
    	sum[0] = 0;
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();    //�����м�������
    	int[] zhongLiang =new int[a];
    	int[] shuLiang =new int[a];
    	for(int i = 0;i < a;i++){
    		zhongLiang[i] = sc.nextInt();
    		shuLiang[i] = sc.nextInt();    //�ֱ������������������ݴ�������������
    	}

    	for(int i = 0;i < a;i++){    //���������������
    		num += shuLiang[i];
    	}
    	int[] arry = new int[num];
    	for(int i = 0;i < a;i++){
    		for(int j = 0;j < shuLiang[i];j++){
    			arry[count] = zhongLiang[i];    //������������е�����ֵ
    			count++;
    		}
    	}
    	//�ӵ�һλ��ʼ������һλһλ�ӣ����Ƚ��Ƿ��֮ǰ��ӵ�����ͬ�ģ���ͬ�Ͳ��������飬��ͬ��������
    	for(int i = 0;i < arry.length ;i++){
    		for(int s = i;s < arry.length;s++){
    			temp = arry[i];
    		for(int j = s+1;j < arry.length;j++){  
    			temp += arry[j];
    		for(int k = 1;k < temp1;k++){  //���������ļ��пɵ�������Ƚ�
    			if(temp == sum[k] ){
    				flag = 1;
    			}
    		}
    		if(flag != 1){    //û����ͬ�ģ������鸴����������
    			sum[temp1] = temp;
    			temp1++;
    		}
    		flag = 0;
    	}
    		}
    	}
    	System.out.print(temp1+1); //��һ���Ҳ��һ�����������Լ�1
    	sc.close();
    }
}
