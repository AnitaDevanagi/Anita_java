class Dresscode {
public static void main(String [] args){
  
     Dress d = new Dress();
     System.out.println(d);
     System.out.println(d.designName+"\t"+d.color+"\t"+ d.cost);


     Dress d1 = new Dress("saree");
     System.out.println(d1);
     System.out.println(d1.designName+"\t"+ d1.color+"\t"+d1.cost);
    
     Dress d2 = new Dress("saree","Black", 5000);
     System.out.println(d2);
     System.out.println(d2.designName+"\t"+ d2.color+"\t"+d2.cost);
   }
}