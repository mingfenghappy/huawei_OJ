package solution;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
For example, given
s = "leetcode",
dict = ["leet", "code"].
 *
 *˼·�����ȴӵ�һ���ַ���������������ѯ����ƥ��ľͰ�ƥ�䵽λ������һλ��־λ��Ϊtrue,��־λ��һ��list���棬
 *����ж������ַ�����󷵻�һλ����һλ��־λ�����true��˵����ƥ�䵽���һλ�ģ����гɹ��ġ�
 */
public class Solution {
	
public static void main(String[] args){
	Set<String> set = new HashSet<String>();
	set.add("leet");
	set.add("code");
	boolean result = Solution1.wordBreak("leetcode", set);

	System.out.println("����ǣ�"+result);
}
}
