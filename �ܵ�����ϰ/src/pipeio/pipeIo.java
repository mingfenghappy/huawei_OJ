package pipeio;
import java.io.*;
public class pipeIo {
public static void main(String[] args) {
	try{
	PipedInputStream in = new PipedInputStream();
	PipedOutputStream out = new  PipedOutputStream();
	in.connect(out);
	Read rd = new Read(in);
	Write wt = new Write(out);
	new Thread(rd).start();
	new Thread(wt).start();
	}
	catch(IOException e){
		throw new RuntimeException("����ʧ��"); 
	}
}
}
class Read implements Runnable{
	private PipedInputStream in;
	public Read(PipedInputStream in){
	  this.in = in;
	}
	public void run(){
		try{
			System.out.print("��ʼ��");
			byte[] buf = new byte[1024];
			int len = in.read(buf);
			String s = new String(buf,0,len);
			System.out.print(s);
			}
			catch(IOException e){
				throw new RuntimeException("��ʧ��"); 
			}
			finally{
				try{
				in.close();
				}
				catch(IOException e){
					throw new RuntimeException("�ر�ʧ��"); 
				}
				
			}
	}
}
class Write implements Runnable{
	private PipedOutputStream out;
	public Write(PipedOutputStream out){
	  this.out = out;
	}
	public void run(){
		try{
			System.out.print("��ʼд");
			//byte[] buf = new byte[1024];
			out.write("�����".getBytes());
			}
			catch(IOException e){
				throw new RuntimeException("дʧ��"); 
			}
			finally{
				try{
				out.close();
				}
				catch(IOException e){
					throw new RuntimeException("�ر�ʧ��"); 
				}
				
			}
	}
}
