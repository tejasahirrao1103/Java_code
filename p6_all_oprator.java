public class p6_all_oprator {
    public static void main(String[] arg) {
        int a = 5;
        int b = 6;

        //arithmatic oprator
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(b);
        
        //a++ ++a / a-- --a
        
        int postIncrement = b++; // first assing then increment 
        int preIncrement = ++b;// first increment then assing
        int postDecrement = b--; // first assing then decrement
        int preDecrement = --b; // first decrement then assing
        
        //assingment oprator

        a+=5; // a=a+5
        a-=5; // a=a-5
        a*=5; // a=a*5
        a/=5; // a=a/5
        a%=5; // a=a%5
        a=5; // a=5

        //relation oprator
        
        System.out.println(a<b); // O|P true
        System.out.println(a>b); // false
        System.out.println(a!=b);// true
        System.out.println(a==b);// false
        System.out.println(a<=b); // true
        System.out.println(a>=b); // false

        // Logical oprator

        System.out.println(a<b&&b!=a); //true
        System.out.println(a>b||b==a); //false
        System.out.println((a>b)||(b!=a)); // true
        System.out.println(!(a>b)); // a>b is flase but its show true
        
        

    }
    
}
