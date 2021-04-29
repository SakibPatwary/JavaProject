//main class it not complete yet

import java.util.Scanner;
import java.io.File;

class Students//parent class
{
	protected String Name;
	protected int ID;
	protected String Course;
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setID(int ID)
	{
		this.ID=ID;
	}
	public void setCourse(String Course)
	{
		this.Course=Course;
	}
	
    public String getName()
	{
		return Name;
	}
	public int getID()
	{
		return ID;
	}
	public String getCourse()
	{
		return Course;
	}
}

class Result extends Students//Result class is a child of Students class
{
	private double MidMarks;
	private double FinalMarks;
	protected double TotalMarks;
	
	public void setMidMarks(double MidMarks)
	{
		this.MidMarks=MidMarks*0.4;//mid mark count 40%
	}
	public void setFinalMarks(double FinalMarks)
	{
		this.FinalMarks=FinalMarks*0.6;//final mark count 60%
	}
	public void setTotalMarks(double TotalMarks)//total mark is  40% of mid and 60% of final
	{
		this.TotalMarks=TotalMarks+MidMarks+FinalMarks;
	}    
	
	
	public double getMidMarks()
	{
		return MidMarks;
	}
	public double getFinalMarks()
	{
		return FinalMarks;
	}
	public double getTotalMarks()
	{
		return TotalMarks;
	}
	
}


public class ProjectPlanV2//Main class
{
	public static void main(String[] args)
	{
		System.out.println("\n WELCOME TO STUDENT EXAMINATION MANAGEMENT SYSTEM \n");
		
		Scanner input1=new Scanner(System.in);	
		
		System.out.print("Enter User Name: ");//use "admin"
		String UserName=input1.next();
		
		System.out.print("Enter Password: ");//use "admin"
		String Password=input1.next();
		
		if((UserName.equals("admin")) && (Password.equals("admin")))
		{
			System.out.println("\n Authentication Successful!!");
			
			//TO BE CONTINUED
			//***************
			//***************
			//***************

		}
		
		else
		{
			System.out.println("\n Authentication Failed!!");
		}
	}
}			