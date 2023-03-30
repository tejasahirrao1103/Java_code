import java.util.Scanner;
public class p9_radius {
    public static void main(String arg[])
    {
     Scanner ip = new Scanner(System.in);
     System.out.print("enter area of circule: ");
     float radius=ip.nextFloat();
     float circl=(radius*radius)*3.14f;
     System.out.println("area of circule is "+circl);

    }
}
