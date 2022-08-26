import java.util.Scanner;

public class JavaControlStatementsIfSwitch {

	void ifThen()
	{
		// if-then statement
		if(1>2) {
			System.out.println("Expression is True..");
		}
	} // ifThen()
	
	
	void ifThenElse()
	{
		// if-then-else statement
		if(1>2) {
			System.out.println("Expression is True..");
		}
		else {
			System.out.println("Expression is False..");
		}
		
	} //ifThenElse()
	
	void ifElseDemo()
	{
		/* Assign a grade based on the value test score:A for score 90%,B for score 80% and so on */
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Enter TestScore in Interger Value : ");
		int testScore=scanObj.nextInt(); // take input from user
		char grade;
		if(testScore==90) {
			grade='A';
		}
		else if(testScore>=80) {
			grade='B';
		}
		else if(testScore>=70) {
			grade='C';
		}
		else if(testScore>=60) {
			grade='D';
		}
		else {
			  grade='F';
			System.out.println("Fail...");
		}
		
		System.out.println("Grade = "+grade);
	}
	
	public static void main(String[] args) {
		
		JavaControlStatementsIfSwitch obj=new JavaControlStatementsIfSwitch();
		obj.ifThen();
		obj.ifThenElse();
		obj.ifElseDemo();
		obj.monthName_SwitchStatement();
		obj.daysInMonth_SwitchStatement();

	} // end main
	
	void monthName_SwitchStatement() {
		/* display name of month  based on value of month*/
		
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Enter Month Number : ");
		int month =scanObj.nextInt();
		String monthString;
		
		switch(month) {
		case 1:monthString="January";
		           break;
		case 2:monthString="February";
                   break;           
		case 3:monthString="March";
		           break;
		case 4:monthString="April";
                   break;
		case 5:monthString="May";
                   break;
		case 6:monthString="June";
                  break;
		case 7:monthString="July";
                  break;
		case 8:monthString="August";
                  break;
		case 9:monthString="September";
                 break;
		case 10:monthString="Octomber";
                 break;
		case 11:monthString="November";
                 break;
		case 12:monthString="December";
                 break;
        default: monthString="Invalid Month";
                 break;
		}
		
		System.out.println(monthString);
		
	} // monthName_SwitchStatement()
	
	
	void daysInMonth_SwitchStatement() {
		/* Calculate number of days in particular month*/
		Scanner scanObj=new Scanner(System.in);
		System.out.println("Calculate number of days in particular month\n");
		System.out.println("Enter Month number : ");
		int month=scanObj.nextInt();
		
		System.out.println("Enter Year in number like.. 2022 : ");
		int year=scanObj.nextInt();
		
		int numDays=0;
		
		switch(month) {
		case 1: case 3:case 5:case 7:case 8:case 10:case 12: numDays=31; break;
		case 4:case 6:case 9:case 11: numDays=30;break;
		case 2 : if(((year%4==0)&& !(year%100==0)) ||(year%400==0))
		             {
			            numDays=29;
		             }
		           else { numDays=28;}
		           break;
		default: System.out.println("Invalid Month"); break;          
		}
		
		System.out.println("Number of Days = "+numDays+" in "+month+" Month");
		
	} // daysInMonth_SwitchStatement()

} // end class
