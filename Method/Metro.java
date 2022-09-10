class Metro {
    String name;
    int compartments;
    int stops;
    int speed;
    String[] stnames;
    
    
    Metro( String name, int compartments,int stops,int speed,String stnames[]){
      this.name=name;
      this.compartments=compartments;
      this.speed=speed;
      this.stops=stops;
      this.stnames=stnames;
    }
       
   void move(){
   System.out.println(name+"\t"+compartments+"\t"+stops+"\t"+speed+"\t"+stnames);
   if (stnames!=null){
   for (int i=0;i<stnames.length;i++){
   System.out.print(stnames[i]);
    }
  }
}

   
public static void main(String [] args){
      String [] stnames={"mejestic","malleshwaram","vijayanagar"};
     Metro a = new Metro("Nam Metro", 10 , 6 , 100 , stnames);
     a.move();
     
 }
}
 