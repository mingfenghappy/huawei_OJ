package getList;

import java.util.ArrayList;
import java.util.List;

/**
 * ���������һ������n, ��һ������k,����������� 1~~n��ȡ��k�������ܵõ��������
 * @author linxj
 *
 */
public class Solution {
	ArrayList<List<Integer>> result = new  ArrayList<List<Integer>>();
	 
public ArrayList<List<Integer>> combine(int n, int k) {
        
        for(int i = 1; i <= n-k+1;++i){
        	ArrayList<Integer> list = new  ArrayList<Integer>();
        	list.add(i);
        	cal(list,i+1,n,k-1);
        }
        return result;
    }
public void cal(List<Integer> list,int start,int end,int k){
	if(k == 0){
		 ArrayList<Integer> a= new  ArrayList<Integer>(list);  //��������һ�����ã����븴��
		result.add(a);
	}else{
		for(int i = start;i <= end;++i){
			list.add(i);
			cal(list,i+1,end,k-1);
			list.remove(list.size()-1);
		}
	}
}
}
