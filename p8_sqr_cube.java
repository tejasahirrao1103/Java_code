import java.util.Scanner;
public class p8_sqr_cube {
    public static void main(String arg[])
    {
        Scanner ip=new Scanner (System.in);
        System.out.print("Enter number : ");
        float n=ip.nextFloat();
        float sqr= n*n;
        float cub=n*n*n;
        System.out.println("squre of "+n+" is "+sqr);
        System.out.println("squre of "+n+" is "+cub);
    }

}
