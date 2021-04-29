import java.util.Scanner;

public class Result{
	
    public static void main(String args[]){
		
        String username, password;
		
        Scanner s = new Scanner(System.in);
		
        System.out.print("\n Enter username:");//username:sakib
        username = s.nextLine();
		
        System.out.print("\n Enter password:");//password:1234
        password = s.nextLine();
		
        if(username.equals("sakib") && password.equals("1234"))
        {
            System.out.println("\n Authentication Successful!!");
			
			String grade = "";
			String[] letters = {"A+", "A", "B+", "B", "C+", "C", "D+", "D", "F"};
    
			double[] grades = {4.00, 3.75, 3.50, 3.25, 3.00, 2.75, 2.50, 2.25, 0.00};
			
			double credit1;
			double credit2;
			double credit3;
			double credit4;
			double gradeValue = 0;
			double grade1 = 0;
			double grade2 = 0;
			double grade3 = 0;
			double grade4 = 0;
			double totGrade = 0;
			double totalCredits = 0;
			double gpa;
		
			System.out.println("\n\n WELCOME TO GPA CALCULATOR [4 Subject]!\n");
			String message;
			
			String name;

			Scanner scan = new Scanner(System.in);
			System.out.print(" Enter your Name : ");
			name = scan.next();

			Scanner console = new Scanner(System.in);

			System.out.print("\n Enter 1st subject credit (2/3) : ");
			credit1 = console.nextDouble();
			System.out.print("\n Enter grades(A+/A/B+...) : ");
			grade = console.next();

			if (grade.equals("A+")) gradeValue = 4.00;
			else if (grade.equals("A")) gradeValue = 3.75;
			else if (grade.equals("B+")) gradeValue = 3.50;
			else if (grade.equals("B")) gradeValue = 3.25;
			else if (grade.equals("C+")) gradeValue = 3.00;
			else if (grade.equals("C")) gradeValue = 2.75;
			else if (grade.equals("D+")) gradeValue = 2.50;
			else if (grade.equals("D")) gradeValue = 2.25;
			else if (grade.equals("F")) gradeValue = 0.00;
			else System.out.println(" \nInvalid Grade!!");

			grade1 = gradeValue * credit1;

			System.out.print("\n Enter 2nd subject credit (2/3) : ");
			credit2 = console.nextDouble();
			System.out.print("\n Enter grades(A+/A/B+...) : ");
			grade = console.next();

			if (grade.equals("A+")) gradeValue = 4.00;
			else if (grade.equals("A")) gradeValue = 3.75;
			else if (grade.equals("B+")) gradeValue = 3.50;
			else if (grade.equals("B")) gradeValue = 3.25;
			else if (grade.equals("C+")) gradeValue = 3.00;
			else if (grade.equals("C")) gradeValue = 2.75;
			else if (grade.equals("D+")) gradeValue = 2.50;
			else if (grade.equals("D")) gradeValue = 2.25;
			else if (grade.equals("F")) gradeValue = 0.00;
			else System.out.println("\n Invalid Grade!!");

			grade2 = gradeValue * credit2;

			System.out.print("\n Enter 3rd subject credit (2/3) : ");
			credit3 = console.nextDouble();
			System.out.print("\n Enter grades(A+/A/B+...) : ");
			grade = console.next();

			if (grade.equals("A+")) gradeValue = 4.00;
			else if (grade.equals("A")) gradeValue = 3.75;
			else if (grade.equals("B+")) gradeValue = 3.50;
			else if (grade.equals("B")) gradeValue = 3.25;
			else if (grade.equals("C+")) gradeValue = 3.00;
			else if (grade.equals("C")) gradeValue = 2.75;
			else if (grade.equals("D+")) gradeValue = 2.50;
			else if (grade.equals("D")) gradeValue = 2.25;
			else if (grade.equals("F")) gradeValue = 0.00;
			else System.out.println("Invalid Grade!!");

			grade3 = gradeValue * credit3;

			System.out.print("\n Enter 4th subject credit (2/3) : ");
			credit4 = console.nextDouble();
			System.out.print("\n Enter grades(A+/A/B+...) : ");
			grade = console.next();

			if (grade.equals("A+")) gradeValue = 4.00;
			else if (grade.equals("A")) gradeValue = 3.75;
			else if (grade.equals("B+")) gradeValue = 3.50;
			else if (grade.equals("B")) gradeValue = 3.25;
			else if (grade.equals("C+")) gradeValue = 3.00;
			else if (grade.equals("C")) gradeValue = 2.75;
			else if (grade.equals("D+")) gradeValue = 2.50;
			else if (grade.equals("D")) gradeValue = 2.25;
			else if (grade.equals("F")) gradeValue = 0.00;
			else System.out.println("\n Invalid Grade!!");
		
			grade4 = gradeValue * credit4;

			totGrade = grade1 + grade2 + grade3 + grade4;
			totalCredits = credit1 + credit2 + credit3 + credit4;
			gpa = totGrade / totalCredits;
			
			
			System.out.println("\n Name: " +name);
			System.out.printf(" GPA : %.2f\n", +gpa);
    }
	
        
		
        else
        {
            System.out.println("\n Authentication Failed!!");
        }
	}
		
    }
