package main;
/**
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 * 1,2,3,4,5,6,7 ���5��6��7��1��2��3��4
 *˼·���Ȱ�ǰһ�����÷����ٰѺ�һ�����÷�����������÷��������Ƶ�Ӣ����ĸ�ķ�ת
 */
public class Main {
	public static void main(String[] args){
		int[] nums = {1,2,3,4,5,6,7};
		Solution.rotate(nums,9);
		for(int i =0 ;i < nums.length;i++)
		System.out.print(nums[i]);
	}
}
