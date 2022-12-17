class Animals
{
    void eat(){
        System.out.println("eating...");
    }
}
class Dogs extends Animals
{
    void bark(){
        System.out.println("barking..");
    }
}
class BabyDog extends Dogs
{
    void play(){
        System.out.println("playing..");
    }
}
class Multilevel
{
    public static void main(String[] args) {
        BabyDog d=new BabyDog();
        d.bark();
        d.eat();
        d.play();
   
    }
}  

