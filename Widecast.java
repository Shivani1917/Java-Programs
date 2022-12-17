public class Widecast {

    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;     //automatic casting int to double
        
        System.out.println(myInt);    //output=9
        System.out.println(myDouble);   //output=9.0

        // //jb hume koi smaller data type ko larger me convert krna hota h to
        // //widening method ka use krte h //automatically change hota h

        byte myByte = 12;
        float myFloat = myByte ;

        System.out.println(myByte);
        System.out.print(myFloat);
    }
    
}
