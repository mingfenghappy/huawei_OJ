package Main;

import java.util.Scanner;

/**
 * 
 * ����һ����ά����N*M������2<=N<=10;2<=M<=10������5 �� 5��������ʾ�� 

int maze[5][5] = {

        0, 1, 0, 0, 0,

        0, 1, 0, 1, 0,

        0, 0, 0, 0, 0,

        0, 1, 1, 1, 0,

        0, 0, 0, 1, 0,

};

����ʾһ���Թ������е�1��ʾǽ�ڣ�0��ʾ�����ߵ�·��ֻ�ܺ����߻������ߣ�����б���ߣ�Ҫ�������ҳ������Ͻǵ����½ǵ����·�ߡ���ڵ�Ϊ[0,0],�ȵ�һ�ո��ǿ����ߵ�·��
 *
 */
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arrs = str.split(" ");
		int[] nums = new int[arrs.length];
		int count = 2;
		for(int i = 0;i < arrs.length;i++){
			nums[i] = Integer.parseInt(arrs[i]);
		}
		int[][] migong = new int[nums[0]][nums[1]];
		for(int i = 0; i < nums[0];i++){ //�����鶨��
			for(int j = 0; j < nums[1];j++){
				migong[i][j] = nums[count];
				count++;					
			}
		}
		
	}
	public boolean check(int[][]nums,int x,int y ){
		int(nums[x+1]!=1 && )
	}
	public void move(int x,int y,int endx,int endy){
		if(x!=endx&&y!=endy){
			move
		}
	}
}
