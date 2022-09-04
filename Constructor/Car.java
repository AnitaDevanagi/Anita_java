class Car {
   String name;
   String color;
   int    seats;

     Car(){
     System.out.println("car is created");
     }

     Car(String nam,int se){
     name=nam;
     seats=se;   
   }

    
     Car(int se, String nam){
     seats=se;
     name=nam;
   }

     Car(String nam, String col,int se){
         name=nam;
         color=col;
         seats=se;
    }
}


