class Calculatordev{

  int Division(int a , int b , int c){
    int sum = a/b/c;
    return sum;
  }

  
  int Division(int a , int b){
    int sum = a/b;
    return sum;
  }
   double Division(double a , int b){
    double sum = a/b;
    return sum;
  }
   
 public static void main(String [] args){
      Calculatordev divide = new Calculatordev();
     
        int af = 125;
        int bf =25;
        int cf =5;
 int number = divide.Division(af,bf,cf);
 System.out.println(number);

 
        int hg = 874;
        int fg =4;
       
 int sum = divide.Division(hg,fg);
 System.out.println(sum);

        double ab = 600;
        int    cd =10;
       
 double total = divide.Division(ab,cd);
 System.out.println(total);
  }
}
 
        