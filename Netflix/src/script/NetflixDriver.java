package script;

import java.util.Scanner;


public class NetflixDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the User Name: ");
		String userName=sc.next();
		System.out.println("Enter the Password: ");
		int pwd=sc.nextInt();
		System.out.println("Enter the Phone number: ");
		long phoneNo=sc.nextLong();
		User u=new User(userName,pwd,phoneNo);
		boolean exit=true;
		while(exit)
		{
		System.out.println("************NETFLIX***************");
		System.out.println("Enter Your Choice:\n1.Login\n2.Exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		  case 1:
		  {
			  NetflixHelperBusiness n=new NetflixHelperBusiness(new User(userName,pwd,phoneNo));
			  n.login();
		  }
		  break;
		  case 2:
		  {
			  exit=false;
		  }
		  break;
		  
		  default:
		  {
			  System.out.println("Invalid Choice Try Again!");
		  }
		}
	}

}
}



