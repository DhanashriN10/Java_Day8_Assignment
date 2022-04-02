/* Usage of Classes,Class Variables and Methods and Usage of Objects, Instances, Instance Variables and Methods
 Employee Wage Computation Problem Part3
*/

package Day8_Assignment;

import java.util.Random;

public class Employee_wage_OOP 

{
	public static final int part_time=1;
	public static final int full_time=2;
	public static final int empwageperhr=20;

	int emphrs=0;
	int empwage=0;
	Random r=new Random();
	int empcheck=r.nextInt(3);

	public void check()
	{
		switch(empcheck)
		{
		case part_time:
			emphrs=4;
			System.out.println("For Part Time Work Total Wage:");
			System.out.println("Employee hrs:"+emphrs);
			empwage=emphrs*empwageperhr;
			System.out.println("Emp wage:"+empwage);
			break;

		case full_time:
			emphrs=8;
			System.out.println("ForFull Time Work Total Wage:");
			System.out.println("Employee hrs:"+emphrs);
			empwage=emphrs*empwageperhr;
			System.out.println("Emp wage:"+empwage);
			break;

		default:
			emphrs=0;
			System.out.println("ABSENT");
			System.out.println("Employee hrs:"+emphrs);
			empwage=emphrs*empwageperhr;
			System.out.println("Emp wage:"+empwage);
		}	


	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee_wage_OOP e=new Employee_wage_OOP();
		e.check();

	}

}
