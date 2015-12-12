package solution;
/**
 * Given a string S, find the longest palindromic substring in S.
�������ϸ����һ���ַ���S�е�����ģ�
 *
 *˼·�������������aba��aa,����Ҫ������ �����������0��s-1���������м��������㣬ֱ��������
 */
public class Solution {
	 public String longestPalindrome(String s) {
		 int length = 0;
		 String str = "";
		 for(int i =0 ;i < s.length();i++){
			 String s1 = longestStr(s,i,i);
			 String s2 = longestStr(s,i,i+1);
			 
			 if(length < s1.length()){
				str = s1; 
				length = s1.length();
			 }
			 if(length < s2.length()){
				 str = s2;
				 length = s2.length();
			 }
		 }
	        return str;
	    }
	 public String longestStr(String s,int i,int j){
		 String string = String.valueOf(s.charAt(i));
		 while(i-1>=0&&j+1<=s.length()&&s.charAt(i-1)==s.charAt(j+1)){
			 string = s.substring(i-1,j+2);
			 i--;
			 j++;
		 }
		 return string;
	 }
}
