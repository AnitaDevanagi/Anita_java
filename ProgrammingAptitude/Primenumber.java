import java.util.Scanner;

class Primenumber{
          int n=13;
  	public static void main(String[] args){
         Primenumber d = new Primenumber();
         System.out.println(d.n);

  	 	Scanner a = new Scanner(System.in);
  		System.out.println("please Enter the value");
   		int n = a.nextInt();
 		 for (int i=2; i<8; i++){
   
 			if(n%i==0){
 				 System.out.println("Not a prime Number");
                                  
                                       break;
                        }
			
                      else{
				System.out.println("prime number");
		}
           }
    
  	}
}
