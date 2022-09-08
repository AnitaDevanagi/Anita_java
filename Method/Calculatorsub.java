class Calculatorsub{


   static int Subtraction(int a , int b, int c){
    int sum = a-b-c;
      return sum;
  }

    static int Subtraction(int a , int b ){
      int sum = a-b;
      return sum;
  }

    static double Subtraction(int a , double b ){
      double sum = a-b;
      return sum;
      
  }
 

   public static void main(String[] args){
      
    int a = 238;
    int b = 120;
    int c = 56;
   int result = Calculatorsub.Subtraction(a , b, c); 
   System.out.println(result);


    int as = 945;
    int bs = 785;
   int total = Calculatorsub.Subtraction(as , bs ); 
   System.out.println(total);
   
    int dg = 124;
    double cg = 40.6d ;
 
    double sub = Calculatorsub.Subtraction(dg , cg ); 
    System.out.println(sub);
 
 
 }
}