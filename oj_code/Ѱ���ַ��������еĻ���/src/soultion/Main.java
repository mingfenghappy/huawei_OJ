package soultion;

import java.util.ArrayList;
import java.util.List;
/**
 * Given an array of strings, return all groups of strings that are anagrams.
Note: All inputs will be in lower-case.
˼·�����ַ���������������map�����ʶλ���ж��Ƿ�����ͬ�ģ�������ͬ��map���еĵ�һ������list,�ѵ�һ����map��־��Ϊ-1����ֹ�ٴε��롣
 *
 */
public class Main {
public static void main(String[] args){
	String[] strs = {"abc","cba","aaa","bca","dd"};
	List<String> list = new ArrayList<String>();
	list = Soultion.anagrams(strs);
	for(int i =  0;i < list.size();i++)
		System.out.println(list.get(i));
	}
}
