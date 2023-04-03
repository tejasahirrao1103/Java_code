import java.util.* ;
public class p18_Find_Quadrant_of_coordinate_point {
    	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("enter X cordinate:- ");
		int x=sc.nextInt();
        System.out.println("enter y cordinate:- ");
		int y=sc.nextInt();
		
        sc.close();
        
		if (x==0&&y!=0)
		{
			 System.out.print("y axis");
		}
		else if (y==0&&x!=0)
		{
			System.out.print("x axis");
		}
		else if (x==0&&y==0)
		{
			System.out.print("Origin");
		}

		else if (x>0&&y>0)
		{
			System.out.print("1st Quadrant");
		}
		else if (x<0&&y>0)
		{
			System.out.print("2nd Quadrant");
		}		
		else if (x<0&&y<0)
		{
			System.out.print("3rd Quadrant");
		}
		else if (x>0&&y<0)
		{
			System.out.print("4th Quadrant");
		}
	}
}
