package ����;

public class ���� {
	
	public static void main(String[] args)
	{
	 String[][] cod = new String[][]{new String[3],new String[]{"��","��"}};
    for(int i =0;i<3;i++ )
    {
	cod[0][i] = "��"+i+"һ����";	
    }
    for(int k=0;k<3;k++)
    	for(int j=0;j<3;j++)
    	{
    		System.out.println(cod[k][j]);
    		
    	}
	}    
}
