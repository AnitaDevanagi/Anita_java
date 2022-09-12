import java.util.Scanner;
   
   
class Evenodd{

       int n;
public static void main(String [] args){
 
  Evenodd sg = new Evenodd();
 System.out.println(sg.n);
 
 Scanner a = new Scanner(System.in);
 System.out.println("Enter the value");
   int n = a.nextInt();
    if(n%2==0){
  System.out.println("Even number");
   }
  else{
  System.out.println("odd number");
   }
 }
}