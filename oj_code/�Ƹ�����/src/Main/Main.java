package Main;

import java.util.Scanner;

/**
 * 
 * @author linxj
 *�������и�����ֵ�����������ľ�ֵ������һλ
 */
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length = 0;
		int num = 0;
		int sum = 0;
		float count = 0;
		while(){
			int s = sc.nextInt();
			if(s < 0){
				length++;
			}else if(s>0){
				sum += s;
				num++;
			}
			 count = (float)sum/num;
		}
		
	}
}
