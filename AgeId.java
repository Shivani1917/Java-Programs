import java.util.Scanner;

class AgeId {
    
    void Aoc(int x){
        if(x>=18){ 
            System.out.println("You are Adult");
        }
        else{
            System.out.println("You are not Adult");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner age1 = new Scanner(System.in);
        
        System.out.println("Enter your age!");
         int age2 = age1.nextInt();
        
        AgeId a = new AgeId();
        a.Aoc(age2);
        age1.close();

    }

}