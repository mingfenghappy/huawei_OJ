package lianxi1;

public class lianxi1 {

	public lianxi1(){
		new lianxi1("A");
	}
	public lianxi1(String s){
		System.out.println("����Ϊ"+s);
		new lianxi1("b","c");
	}
	public lianxi1(String s,String ss){
		System.out.println("��һ��Ϊ"+s+"�ڶ���Ϊ"+ss);
	}
	public static void main(String args[]){
		new lianxi1();
	}
}