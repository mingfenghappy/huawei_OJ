package reference;

class DataWrap
{
	public int a;
	public int b;
}
public class refer {

	public static void swap(DataWrap dp)
	{
		int temp = dp.a;
		dp.a = dp.b ;
		dp.b = temp;
		System.out.println("�����aֵΪ"+dp.a+"bֵΪ"+dp.b);
	}
	public static void main(String[] args)
	{
		DataWrap dw = new DataWrap();
		dw.a= 6;
		dw.b=9;
		swap(dw);
		System.out.println("�����aΪ"+dw.a+"b��Ϊ"+dw.b);
		
	}
}
