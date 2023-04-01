import java.util.*;
public class p14_printNameAndAge {
    public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter age");
		short age = sc.nextShort();
        sc.close();
		System.out.print("The name of the person is " + name + " and the age is " + age + ".");
		
	}
}
