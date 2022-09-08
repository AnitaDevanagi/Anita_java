class Calculator{
      String brandname;
      int cost;
      boolean issolarpower;
      

   int addition(int a, int b , int c){
      int sum = a+b+c;
      return sum;
     }

    int addition (int a, int b){
       int total = a+b;
       return total;
    }

     double addition (double x, int y ){
       double total = x+y;
       return total;
    }



  public static void main(String [] args){

    Calculator calculator = new   Calculator();
         int ab=34;
         int bc=35;
         int cd =67;
         int result = calculator.addition(ab,bc,cd);
         System.out.println(result);         
   
  
          int ag = 145;
          int bg = 876; 
          int total = calculator.addition(ag ,bg);
          System.out.println(total);
         
         double x = 66.6d;
         int    y = 10;
        double add = calculator.addition(x,y);
         System.out.println(add);
         }

   }
