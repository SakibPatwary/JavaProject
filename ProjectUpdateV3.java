import java.util.Scanner;
import java.util.Formatter;
import java.io.FileNotFoundException;
import java.io.File;

class Students//parent class
{
	protected String Name;
	protected String ID;
	protected String Course;
	
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setID(String ID)
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
	public String getID()
	{
		return ID;
	}
	public String getCourse()
	{
		return Course;
	}
}

class Results extends Students//Results class is child class of Students class
{
	private double MidMarks;
	private double FinalMarks;
	protected double TotalMarks;
	
	public void setMidMarks(double MidMarks)
	{
		this.MidMarks=MidMarks*0.4;//Count 40%
	}
	public void setFinalMarks(double FinalMarks)
	{
		this.FinalMarks=FinalMarks*0.6;//Count 60%
	}
	public void setTotalMarks(double TotalMarks)
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

abstract class AdminInfo//Abstraction
{
    abstract void ShowInfo();
}

class Info extends AdminInfo
{
	void ShowInfo()
	{
		System.out.println("Admin User Name: admin");
		System.out.println("Admin Password: admin");
		System.out.println("\n !!! CODE EXITED !!! \n");
	}
}

class Admin//Polymorphism
{
    void display(String Name,String ID)
    {
    	System.out.println("Admin Name : "+Name);
    	System.out.println("Admin ID: "+ID);
	}
}

public class ProjectUpdateV3//Main class
{
	public static void main(String[]args)
	{
		System.out.println("\n\nWELCOME TO STUDENT EXAMINATION MANAGEMENT SYSTEM\n");
		
		Scanner input1=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		Scanner input3=new Scanner(System.in);
		Scanner input4=new Scanner(System.in);
		Scanner input5=new Scanner(System.in);

		System.out.print("Enter User Name: ");//username: admin
		String UserName=input1.next();
		
		System.out.print("Enter Password: ");//password: admin
		String Password=input1.next();
		
		if((UserName.equals("admin")) && (Password.equals("admin")))
		{
			System.out.println("\nAuthentication Successful!!");
			System.out.println();
			
			for (int j=0;j<5;j++)
			{
				System.out.println("\n1. Enter Student Data");
				System.out.println("2. Show Results");
				System.out.println("3. Exit\n");
				System.out.print("Enter Choice: ");

				int Choice=input2.nextInt();
				
				Results M1=new Results();
				
				switch (Choice)
				{
					case 1:
					
				try 
					{
						Formatter WriteData=new Formatter("Student Marks Data.txt");
						
						System.out.print("How many Students: ");
						int Loop=input4.nextInt();
						System.out.println();
						
						
						for(int i=1;i<=Loop;i++)
						{
							System.out.print("\nEnter Student Name: ");
							String Name=input3.next();
							M1.setName(Name);	
							
							System.out.print("Enter Student ID: ");
							String ID=input3.next();
							M1.setID(ID);
							
							System.out.print("Enter Course Name: ");
							String Course=input3.next();
							M1.setCourse(Course);
							
							System.out.print("Enter Mid Term Marks: ");
							double MidMarks=input3.nextDouble();
							M1.setMidMarks(MidMarks);
							
							System.out.print("Enter Final Term Marks: ");
							double FinalMarks=input3.nextDouble();
							M1.setFinalMarks(FinalMarks);
							
							M1.setTotalMarks(0);

							String StdGrade="";
							
							if(M1.getTotalMarks()<=49)
							{
								StdGrade="F & GPA: 0.00";
							}
							else if((M1.getTotalMarks()>=50)&&(M1.getTotalMarks()<=59))
							{
								StdGrade="D & GPA: 2.25";
							}
							else if((M1.getTotalMarks()>=60)&&(M1.getTotalMarks()<=64))
							{
								StdGrade="D+ & GPA: 2.50";
							}
							else if((M1.getTotalMarks()>=65)&&(M1.getTotalMarks()<=69))
							{
								StdGrade="C & GPA: 2.75";
							}
							else if((M1.getTotalMarks()>=70)&&(M1.getTotalMarks()<=74))
							{
								StdGrade="C+ & GPA: 3.00";
							}
							else if((M1.getTotalMarks()>=75)&&(M1.getTotalMarks()<=79))
							{
								StdGrade="B & GPA: 3.25";
							}
							else if((M1.getTotalMarks()>=80)&&(M1.getTotalMarks()<=84))
							{
								StdGrade="B+ & GPA: 3.50";
							}
							else if((M1.getTotalMarks()>=85)&&(M1.getTotalMarks()<=89))
							{
								StdGrade="A & GPA: 3.75";
							}
							else if((M1.getTotalMarks()>=90)&&(M1.getTotalMarks()<=100))
							{
								StdGrade="A+ & GPA: 4.00";
							}
							else
							{
								StdGrade="\nINVALID INPUT!!";
							}

							WriteData.format("%s %s %s %s %s %s %s\r\n",Name,ID,Course,MidMarks,FinalMarks,M1.getTotalMarks(),StdGrade);	
							
						}
						WriteData.close();
					}
					catch(FileNotFoundException e)
					{
						System.out.println(e);
					}
					break;
					
					case 2:
					
					try
					{
						File ReadData=new File("Student Marks Data.txt");
						Scanner ScanData=new Scanner(ReadData);
						
						while (ScanData.hasNext())
						{
							String Name=ScanData.next();
							String ID=ScanData.next();
							String Course=ScanData.next();
							String MidMarks=ScanData.next();
							String FinalMarks=ScanData.next();
							String TotalMarks=ScanData.next();
							String StdGrade=ScanData.nextLine();
							
							
							System.out.println("\nName: "+Name+"\nID: "+ID+"\nCourse: "+Course+"\nMid Marks: "+MidMarks+"\nFinal Marks: "+FinalMarks+"\nTotal Marks: "+TotalMarks+"\nGrade: "+StdGrade);
							
						}
						ScanData.close();
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
					break;
					
					case 3:
					System.exit(0);
					break;
					
					default:
					System.out.println("INVALID INPUT!!");	
				}
				
			}
		}
		
		else
		{
			System.out.println("\nAuthentication Failed!!\n");
		}
		
		Admin A1=new Admin();
		A1.display("Sakib Patwary","18-38140-2");
		
		AdminInfo A;
		A=new Info();
		A.ShowInfo();
	}
}				