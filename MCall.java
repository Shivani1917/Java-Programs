public class MCall {

    static void myMethod(){
        System.out.println("I just got executed.");
    }
    public static void main(String[] args) {
        myMethod();    //method can be called multiple times.
        myMethod();
        myMethod();
    }
}
