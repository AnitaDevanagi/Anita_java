class Homebuilt{
  public static void main(String[] args){
  
  Home h = new Home();
  System.out.println(h);
  System.out.println(h.name+"\t"+h.color+"\t"+h.noOfrooms);


  Home h1 = new Home("Shanti Nivas","Yellow");
  System.out.println(h1);
  System.out.println(h1.name+"\t"+h1.color+"\t"+h1.noOfrooms);
   
  
  Home h2 = new Home("Shanti Nivas",4 );
  System.out.println(h2);
  System.out.println(h2.name+"\t"+h2.color+"\t"+h2.noOfrooms);
  }
}