package Main;
/**
 * �ڸ��������䷶Χ���ҳ����������ܹ��ɵ����ĵȲ�����
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
 public static void main(String[] args){
	 int flag = 1;
	 int num = 0;
	 int temp = 0;
	 int max = 0;
	 int temp1 = 0;
	 int temp2 = 0;
	 int temp3 = 0;
	 Scanner sc = new Scanner(System.in);
	 int s = sc.nextInt();
	 int s1 = sc.nextInt();
	 ArrayList<Integer> alist = new ArrayList<Integer>(); 
	 if(s >= 0 && s1 > s && s1<=30){
	 for(int i = s;i < s1;i++){
        for(int j = 2;j < i;j++){
        	if(i%j == 0){
        		flag = 1;
        	}
        }
        if(flag == 0){  //�����Χ�ڵ���������
        	alist.add(i);
        }
        flag = 0;
	 }
	 
	 for(int i = 0;i < alist.size();i++){   //��alist��һ������ʼ�ж�
		 for(int j = 1;j < alist.size();j++){   //�Ȳ�ֵ��1��ʼ
			 int sum = alist.get(i);
			 while(sum <= s1){
			 if(alist.contains(sum)){
				 num++;
				 temp = alist.get(i);
				 temp2 = j;
			 }
			 else if(!alist.contains(sum)){
				 break;
			 }
			 sum += j;
		 }
			 if(max < num){  //ȡ����������Ȳ�����
				 max = num;
				 temp1 = temp;
				 temp3 = temp2;
			 }
			 num = 0;
		 }
		
	 }
	 for(int i = 0;i < max;i++){
		 if(i != max-1){
	 System.out.print((temp1+temp3*i)+" ");
		 }
		 else if(i == max-1){
			 System.out.print(temp1+temp3*i);
		 }
	 }
	 }
	 sc.close();
 }
}