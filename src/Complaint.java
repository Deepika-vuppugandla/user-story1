
public class Complaint implements Customer {

	int cid;
	String title;
	String status;
	
	public Complaint() {
	super();	
	}
	
	public Complaint(int cid,String title,String status)
	{    
		
	   super();
		this.cid=cid;
		this.title=title;
		
		this.status=status;

	}
	
	
	public void launchComplaint() {
	      System.out.println("details:" +cid+""+title+""+status);
		}

	
}
