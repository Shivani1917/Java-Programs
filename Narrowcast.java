public class Narrowcast {

    public static void main(String[] args) {
        double myDouble =9.78d;
        int myInt = (int) myDouble;   //Manual casting:double to int

        System.out.println(myDouble);   //output:9.78
        System.out.println(myInt);      //output:9

        //narrowing casting me larger datatype ki value ko smaller me assign krte h
        //iske liy (small) myLarger;

        float myFloat = 9.7f;
        byte myByte = (byte) myFloat;

        System.out.println(myFloat);   //output:9.7
        System.out.println(myByte);   //output:9
    }
    
}
