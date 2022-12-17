class Display{
     void displayName(){
        System.out.println("Hello");
    }
    void displayResult(){
        System.out.println("Result is good");
    }
}
class myResult {
    public static void main(String[] args) {
        Display d1=new Display();
        d1.displayName();
        d1.displayResult();
    }
    
}
