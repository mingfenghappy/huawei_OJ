package person;

public class persontest {
	private static String name = "abc";
	
	public static void main(String[] args)
	{
		Person p =new Person();
		Person p1 =new Person();
		p1.setName("cd");
		p.setAge(3);
		
		
		System.out.println("���name"+p1.getName());
		System.out.println("���age"+p.getAge());
		System.out.println("nameֵ��"+name);
	}

}
class Person
{ 
	
	//Persontest p3 =new Persontest();
    private String name;
  	private int age;
  	//persontest p3 =new persontest();
  	public void setName (String name)
  	{
  		if(name.length()>4||name.length()<2)
  		{
  			System.out.println("����");
  			return;
  		}
  		else
  		{
  			this.name = name;
  		}
  	}
  	public String getName()
  	{
  		persontest p3 =new persontest();
  		return this.name;
  	}
  	public void setAge (int age)
  	{
  		if(age>100||age<0)
  		{
  			System.out.println("����");
  			return;
  		}
  		else
  		{
  			this.age = age;
  		}
  	}
  	public int getAge()
  	{
  		return this.age;
  	}
  	
}

