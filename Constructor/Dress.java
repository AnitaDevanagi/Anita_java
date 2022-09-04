class Dress{
       String designName;
       String color;
       int    cost;

    Dress(){
    System.out.println("created object");
    System.out.println("object created");
    }

   Dress(String dName){ 
   System.out.println("created object");
   designName=dName;
   System.out.println("object created");
   }
   
   Dress(String dName, String col,int cos){
   System.out.println("created object");
   designName=dName;
   color=col;
   cost=cos;
   System.out.println("created object");
   }
   
}



    
       