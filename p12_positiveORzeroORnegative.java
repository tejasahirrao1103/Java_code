import java.util.Scanner;
public class p12_positiveORzeroORnegative {
public static void main(String arg[])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("enter number: ");
    int n= sc.nextInt();
    sc.close();

    if (n>0)
    {
        System.out.print("postive");
    }

    else if(n<0)
    {
        System.out.println("negative");
    }

    else 
    {
        System.out.println("zero");
    }
}
    
}
