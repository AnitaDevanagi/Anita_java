class Shopat{
    public static void main(String [] agrs){
    
   System.out.println(Shop.name);
   System.out.println(Shop.location);

       Shop s=new Shop(200,20000,false,4f);

    System.out.println(s.noOfworkers);
    System.out.println(s.income);
    System.out.println(s.womens);
    System.out.println(s.reviews);

     Shop ab = new Shop(); 
   
    for (int i=0;i<ab.owner.length;i++){
     System.out.println(ab.owner[i]);

   }
  } 
}