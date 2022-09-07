class Dog {

  String name;
  String color;
  int cost;
    
  void eat(){
  System.out.println("object is created");
   }

  public static void main(String [] args){
  Dog a = new Dog();
  a.eat();
 System.out.println(a.name);
   }
}
  