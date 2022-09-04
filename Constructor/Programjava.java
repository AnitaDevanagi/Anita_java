class Programjava {
   public static void main(String[] args){
   
   Program p = new Program();
   System.out.println(p);
   System.out.println(p.Proname+"\t"+p.Developername+"\t"+p.Firstname+"\t"+p.Year);

   Program p1 = new Program("java");
   System.out.println(p1);  
   System.out.println(p1.Proname+"\t"+p1.Developername+"\t"+p1.Firstname+"\t"+p1.Year);

   Program p2 = new Program("java","james Gosling","Oka",1995 );
   System.out.println(p2);  
   System.out.println(p2.Proname+"\t"+p2.Developername+"\t"+p2.Firstname+"\t"+p2.Year);


  }
}