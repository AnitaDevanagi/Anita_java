class StringtocharArray{

  String c = "Restaurant";
  char[] d = c.toCharArray();

 
 public static void main(String[] args){
  
   StringtocharArray name = new StringtocharArray();
   for(int i=0; i<name.d.length;i++){
   System.out.println(name.d[i]);
  }
 }
}
  