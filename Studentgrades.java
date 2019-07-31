import java.util.*;

public class studentGrades {
	public static void main(String[] args) 
	{
		int english, chemistry, computers, physics, maths; 
	    
		Scanner in = new Scanner(System.in);
		
		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = in.nextInt();	
		chemistry = in.nextInt();	
		computers = in.nextInt();	
		physics = in.nextInt();	
		maths = in.nextInt();	
		grades(english,chemistry,computers,physics,maths); // function calling
	
	} // main ends
	
	public static void grades(int eng,int chem, int com, int phy, int math){
		float total, Percentage;
		
		total = english + chemistry + computers + physics + maths;
	    Percentage = (total / 500) * 100;
	 
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Marks Percentage =  " + Percentage);
		
		if(Percentage >= 90)
	    {
			System.out.println("\n Grade A");
		}
		else if(Percentage >= 80)
	    {
			System.out.println("\n Grade B");
		}
		else if(Percentage >= 70)
	    {
			System.out.println("\n Grade C");
		}
		else if(Percentage >= 60)
	    {
			System.out.println("\n Grade D");
		}
		else if(Percentage >= 40)
	    {
			System.out.println("\n Grade E");
		}
		else 
	    {
			System.out.println("\n Fail");
		} 
	} // studentGrades function ends
} // class ends