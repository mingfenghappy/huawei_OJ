package solution;
/**
 * Given an array of n positive integers and a positive integer s, find the minimal length of a subarray of which the sum �� s. If there isn't one, return 0 instead.
For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.
˼·����ν�Ĵ��ڻ������� ���Ƕ���ǰ�������꣬�������������ƣ�������굽�ұ��С��s,�ұ�������ƣ������ڣ�������ƣ�ֱ���ұ굽��ĩβ
 *
 */
public class Main {
	public static void main(String[] args){
		int[] nums = {1,1,8,4};
		System.out.print(Solution.minSubArrayLen(7, nums)+"");
	}
}
