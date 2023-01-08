package script;

public class User {
	String userName;
int pwd;
long phoneNo;

User(String userName,int pwd,long phoneNo)
{
	this.userName=userName;
	this.pwd=pwd;
	this.phoneNo=phoneNo;
}
User(String userName,int pwd)
{
	this.userName=userName;
	this.pwd=pwd;
}
User(int pwd,long phoneNo)
{
	this.pwd=pwd;
	this.phoneNo=phoneNo;
}

}

	



