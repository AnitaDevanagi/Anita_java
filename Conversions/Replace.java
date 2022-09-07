class Replace{

    String a = "Animal";
    String name= a.replace('a','e');

    String hjk = "The Animal name is Tiger";
    String c= hjk.replace("is","was");
   
    String nam = "Hotel";
    String cd = nam.replace("Hotel","Restaurant");


   public static void main(String[] args){

   Replace ab = new Replace();
   System.out.println(ab.name);
   System.out.println(ab.c);
   System.out.println(ab.cd);
   }
}