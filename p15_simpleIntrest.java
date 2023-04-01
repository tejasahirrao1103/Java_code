import java.util.*;
public class p15_simpleIntrest {
    public static void main(String args[]) {
		
		Scanner ip = new Scanner(System.in);
        System.out.println("Enter principal amount");
		int a=ip.nextInt();
        System.out.println("Enter rate of Intrest");
		float b=ip.nextFloat();
        System.out.println("Time period");
		int c=ip.nextInt();

		ip.close();

		double d= (a*b*c)/100;
		System.out.println((int)d);
		
	}
}
