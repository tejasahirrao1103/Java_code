import java.util.* ;
public class p17_total_salary {
    public static void main(String args[]) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter basic:- ");
		double basic = sc.nextDouble();
        System.out.println("enter employee grade:- ");
		char grade = sc.next().charAt(0);
		sc.close();
		//double ts;
		
		if (grade=='A')
		{
			double ts =basic+1700+((basic/100)*20)+((basic/100)*50)-((basic/100)*11);
			System.out.print(Math.round(ts));
		
		}
	
		else if (grade=='B')
		{
			double ts =basic+1500+((basic/100)*20)+((basic/100)*50)-((basic/100)*11);
			System.out.print(Math.round(ts));
		
		}

		else
		{
			double ts =basic+1300+((basic/100)*20)+((basic/100)*50)-((basic/100)*11);
			System.out.print(Math.round(ts));
		
		}
		
	}
}
