public class p5_arith_oprator {
    public static void main(String arg[])
    {
        int a= 115, b= 5, c;
        
        // binary opration {+,-,*,/}
        c=a+b;
        System.out.println("addition "+c);

        c=a-b;
        System.out.println("substraction "+c);

        c=a*b;
        System.out.println("multiplication "+c);
        
        c=a/b;
        System.out.println("division "+c);
    
        //unary oprator {++,--}
        
        System.out.println("c before c++ "+c);
        
        c++; //increment 
        System.out.println("c after c++ "+c);

        System.out.println("c before c-- "+c);
        
        c--;// decrement
        System.out.println("c after c-- "+c);


    }
}
