class Marks{
    String name;
    int m;
    void printResult(){
        System.out.println("Here you can find Result");
    }
    void printHello(){
        System.out.println("Hello, you are pass");
    }

}

class studentResult {
  public static void main(String[] args) {
      Marks m1=new Marks();
      m1.name="Ajay";
      m1.m=12;
      
      Marks m2=new Marks();
      m2.name="Akash";
      m2.m=14;
      
      m1.printResult();
      
      System.out.println(m1.m);
      
      System.out.println(m1.name);
      
      m1.printHello();
      
      m2.printResult();
      
      System.out.println(m2.m);
      
      System.out.println(m1.name);
      
      m2.printHello();
  }  
}
