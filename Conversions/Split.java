class Split {

    
    String a = "Hello-how-are-you";
    String[] c = a.split("-"); 
  

 public static void main (String[] args){

    Split sp = new Split();
    for(int i=0; i<sp.c.length;i++){
    System.out.println(sp.c[i]);
     
   }

  }

}