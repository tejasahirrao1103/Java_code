import java.util.Scanner;
public class p11_compr_3_no {
    

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int a = sc.nextInt();
    
        System.out.print("Enter number 2 : ");
        int b = sc.nextInt();

        System.out.print("Enter number 3 : ");
        int c = sc.nextInt();

        if (a>b&&a>c)
        {
            System.out.println("a is larger");
        }
        else if (b>a&&b>c)
        {
            System.out.println("b is larger");
        }
        else 
        {
            System.out.println("c is larger");
        }
    }
}
