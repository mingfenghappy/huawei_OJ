package Main;

import java.util.Scanner;

/**
 * ������A��������B ����С��������ָ �ܱ�A��B��������С��������ֵ�����һ���㷨��������A��B����С������
 * @author Administrator
 *
 */
public class Main {
public static void main(String[] args){
	int temp = 0;
	int max;
	int min;
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
    if(a > b){
    	max = a;
    	min = b;
    }
    else{
    	max = b;
    	min = a;
    }
	for(int j = 1;j <= j;j++){
		if((max*j)%min == 0){
		   temp = max*j;
		   break;
		}
	}
	System.out.print(temp);
	sc.close();
}
}
