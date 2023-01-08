package script;

import java.util.Scanner;



public class NetflixHelperBusiness implements NetflixHelper {
	User u;
	String mname;
	String duration;
	String lang;
	double rating;
	Scanner sc=new Scanner(System.in);
	
	NetflixHelperBusiness(User u)
	{
		this.u=u;
	}
	
	public void addMovies()
	{
		System.out.println("Enter the movie Name: ");
		 mname=sc.next();
		System.out.println("Enter the Movie Duration: ");
		 duration=sc.next();
		System.out.println("Enter the language: ");
		 lang=sc.next();
		System.out.println("Enter the Movie Rating: ");
		 rating=sc.nextDouble();
		
	}
	public void displayMovies()
	{
		System.out.println("Movie Name: "+mname);
		System.out.println("Movie Duration: "+duration);
		System.out.println("Movie Lanuage: "+lang);
		System.out.println("Movie Rating: "+rating);
	}
	
	public void login()
	{
		System.out.println("Enter the phone Number: ");
		long phoneNo=sc.nextLong();
		System.out.println("Enter the password: ");
		int pwd=sc.nextInt();
		if(this.u.phoneNo==phoneNo&&this.u.pwd==pwd)
		{
			System.out.println("Login Sucessfull");
			boolean logout=true;
			while(logout)
			{
			System.out.println("Enter Your Choice:\n1.Add Movies\n2.Display Movies\n3. Display User Details\n4.Log Out");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					addMovies();
				}
				break;
				
				case 2:
				{
					displayMovies();
				}
				break;
				
				case 3:
				{
					displayUser();
				}
				break;
				
				case 4:
				{
					logout=false;
				}
				break;
				
				default:
				{
					System.out.println("Invalid Choice. Try Again!");
				}
				
			}   
		}
		}
		else
		{
			System.out.println("Invalid Credentials Try Again :)");
		}
	}
	
	@Override
	public void displayUser()
	{
		System.out.println("User Name: "+this.u.userName);
		System.out.println("Password: "+this.u.pwd);
		System.out.println("Phone Number: "+this.u.phoneNo);
	}
}






