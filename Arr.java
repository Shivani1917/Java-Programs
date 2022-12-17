public class Arr {
    public static void main(String[] args) {
        String[] cars ={"volvo","BMW","ford","mazda"};
        
        System.out.println(cars[0]);
        
        cars[0]= "opel";
        System.out.println(cars[0]);
        
        System.out.println(cars.length);
        
        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
