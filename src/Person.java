import java.util.Arrays;

public class Person implements Customer {

	int id;
	String name;
	Complaint [] c_list;
	public Person() {
		
	}

	public Person(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
		
	}
	
	public void showData() {
		System.out.println("name:"+name+"id:"+id);
	}
	

	@Override
	public void launchComplaint() {
		// TODO Auto-generated method stub
      System.out.println("your launched complaints are: ");
   
	}
	
	


}
