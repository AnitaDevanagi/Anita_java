class Earphone{
     String brandname;
     String country;
     String model;
     short    price;
     boolean iswireless;
     String [] types;
     

      Earphone(String brandname,String Country,String model,  short price,boolean iswireless,String [] types){
      this.brandname =brandname;
      this.country=country;
      this.model=model;
      this.price=price;
      this.iswireless=iswireless;
      this.types=types;
     }


       void Here(){
         System.out.println(brandname + "\t"+ country+ "\t"+ model +"\t"+  price +"\t"+ iswireless );
          for(int i=0; i<types.length;i++){
          System.out.print(types[i]); 
        
       }
}
           
         public static void main(String [] args){
          String [] types={"Closed black Headphones","On Ear Headphones","In Ear Headphones"};
          
          short d = 1600;
          Earphone a = new Earphone("Amkette" , "India","Trubeats Urban Bluetooth" , d ,true,types);
          a.Here();
       
    }
}