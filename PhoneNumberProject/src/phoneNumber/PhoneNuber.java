package phoneNumber;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class PhoneNuber {
	public static void main(String[] args){
	String str="";
	ArrayList<String> list = new ArrayList<String>();
	String[] stra = new String[3000];
	int ct = 0;
	int ct2 = 0;
	BufferedReader br = null;
	BufferedWriter bw = null;
	try {
		br = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\total.txt")));
		bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("F:\\total2.txt")));
		while((str=br.readLine())!=null) {
			ct2++;
			if(!list.contains(str))
			list.add(str);
			bw.write(str);
			bw.newLine();
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (IOException e){
		System.out.println("��ȡ��д���ļ�ʧ��");
	} finally {
			try{
				bw.write("��������"+ct2+"���绰���룬"+"��Ч�ĵ绰Ϊ"+list.size()+"��"+"�ظ��ĺ���Ϊ"+(ct2-list.size())+"��");
				System.out.println("��������"+ct2+"���绰���룬"+"��Ч�ĵ绰Ϊ"+list.size()+"��"+"�ظ��ĺ���Ϊ"+(ct2-list.size())+"��");
				bw.flush();
				br.close();
				bw.close();
				} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}
	
}

}
