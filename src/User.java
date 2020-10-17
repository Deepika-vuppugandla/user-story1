import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		int pid;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		pid=sc.nextInt();
		int cid;
		System.out.println("eneter complaint id:");
		cid=sc.nextInt();
		System.out.println("complaint id:"+cid);
		switch(pid)
		{
		case 1:System.out.println("person name=deepika");
		      break;
		case 2:System.out.println("person name=priyanka");
	           break;
		case 3:System.out.println("person name=rudved ");
	            break;
		case 4:System.out.println("person name=sony");
	      break;
	      default:System.out.println("enter proper id");
	        break;
		}
		Customer[] cust=new Customer[7];
		
		
		cust[0]=new Complaint(1,"service","clear");
		cust[1]=new Complaint(2,"damage","under process");
		cust[2]=new Complaint(3,"software","stopped");
		cust[3]=new Complaint(4,"material","process");
		cust[4]=new Person(1,"deepika");
		cust[4].launchComplaint();
		
	
	}

}
