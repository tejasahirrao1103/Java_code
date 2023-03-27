public class p4_typ_conv {
    public static void main(String arg[])
    {
        // Widening Casting  // Implicite

        // byute->short->char->int->long->float->double   {according bit size}

        byte by = 100;
        System.out.println("This is byte "+by);

        short sh=by;
        System.out.println("This is byte converted to short:- "+sh);

        int in=sh;
        System.out.println("This is short converted to int:- "+in);

        long ln=in;
        System.out.println("This is int converted to long:- "+ln);

        float fol=ln;
        System.out.println("This is long converted to float:- "+fol);
        
        double dbl=fol;
        System.out.println("This is float converted to double:- "+dbl);

        //Explicite  // Widening Casting

        char ch=(char)by;
        System.out.println("This is byte converted to char:- "+ch);
       
        //Narrowing Casting //Explicit

        double dbl1=112.323342324323;
        System.out.println("This is double:- "+dbl1);

        float fol1=(float)dbl1;
        System.out.println("This is Double converted to float:- "+fol1);

        long ln1=(long)fol1;
        System.out.println("This is float converted to long:- "+ln1);

        int in1=(int)ln1;
        System.out.println("This is long converted to int:- "+in1);

        char ch1=(char)in1;
        System.out.println("This is int converted to char:- "+ch1);

        short sh1=(short)ch1;
        System.out.println("This is char conveted to short:- "+sh1);

        byte by1=(byte)sh1;
        System.out.println("This is byte conveted to short:- "+by1);


    }
}
