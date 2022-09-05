class Restaurant{
      static String name = "Abhiruchi";
      static String location="Raichur";
      static int cost=10000000;

      String[] owner={"Abhi","Sneha","Pavan","Keerthi"};
      String manager;
      int  noOfworkers;
      boolean veg;
      float  reviews;


        Restaurant(){
        }
   
      Restaurant(String manage, int noworker, boolean ve, float rev){
      manager=manage;
      noOfworkers=noworker;
      veg=ve;
      reviews=rev;
      }

      

     public static void main (String[] args){
     
      System.out.println(Restaurant.name);
      System.out.println(Restaurant.location);
      System.out.println(Restaurant.cost);
     
      Restaurant restaurant = new Restaurant();
      System.out.println(restaurant.owner[0]);
      System.out.println(restaurant.owner[1]);
      System.out.println(restaurant.owner[2]);
      System.out.println(restaurant.owner[3]);
  

      Restaurant abc = new Restaurant("Nikhil",230,true,4.5f);
      
      System.out.println(abc.manager);
      System.out.println(abc.noOfworkers);
      System.out.println(abc.veg);
      System.out.println(abc.reviews);


     
       
     }
}

     

    
      
      