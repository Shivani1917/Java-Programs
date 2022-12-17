public class Ifelse {
    public static void main(String[] args) {
        int i=9;
        if(i<5){
            System.out.println("This is TRUE!");
        }
        else{
            System.out.println("This is FALSE!");
        }

        //SHORTHAND property::::variable = (condition) ? expressionTrue :  expressionFalse;

        int j=0;
        String k=(j<5) ? "This is TRUE!" : "This is FALSE" ;
        System.out.println(k);
    }
}
