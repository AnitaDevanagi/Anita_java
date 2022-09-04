class Cardrive{
   public static void main(String [] args){
  
   Car c1 = new Car();
  System.out.println(c1);
  System.out.println(c1.name+"\t"+c1.color+"\t"+c1.seats);
  
   Car c2 = new Car("Maruthi", 4);
   System.out.println(c2);
   System.out.println(c2.name+"\t"+c2.color+"\t"+c2.seats);
    

   Car c4 = new Car(  4 ,"Maruthi" );
   System.out.println(c4);
   System.out.println(c4.name+"\t"+c4.color+"\t"+c4.seats);
    
  
   Car c3 = new Car("Maruthi","White",4);
   System.out.println(c3);
   System.out.println(c3.name+"\t"+c3.color+"\t"+c3.seats);


}
}