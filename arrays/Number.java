class Number {

  int [] number = new int[6];

 Number(){
 number[0]=2;
 number[1]=4;
 number[2]=67;
 number[3]=65;
 number[4]=14;
 number[5]=6;

 }
 
 public static void main(String[] args){
 
  Number c = new Number();

  for(int i=0; i<c.number.length;i++){
  

  System.out.println(c.number[i]);
  }

 }


}
   
    