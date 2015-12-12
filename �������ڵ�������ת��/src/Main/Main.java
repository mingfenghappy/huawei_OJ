package Main;

import java.util.Scanner;

public class Main {
	 /*****************************************************************************
	 Description   : ����ת��
	 Input Param   : year �������
	                Month �����·�
	                Day ������
	                    
	 Output Param  :
	 Return Value  : �ɹ�����0��ʧ�ܷ���-1���磺���ݴ���
	 *****************************************************************************/
	 public static int iConverDateToDay(int year, int month, int day)
	 {
		 int sum = 0;
		 int[] run = {0,31,29,31,30,31,30,31,31,30,31,30,31};
		 int[] ping = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	     if(((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0)){
	    	 for(int i = 0;i < month;i++){
	    		 sum += run[i];
	    	 }
	    	 return sum + day;
	     }
	     else{
	    	 for(int i = 0;i < month;i++){
	    		 sum += ping[i];
	    	 }
	    	 return sum + day;
	     }
	    
	 }
	 public static void main(String[] args){

		 Scanner sc = new Scanner(System.in);
		 int year = sc.nextInt();
		 int month = sc.nextInt();
		 int day = sc.nextInt();
		 System.out.print(iConverDateToDay(year,month,day));
		 sc.close();
	 }
}
