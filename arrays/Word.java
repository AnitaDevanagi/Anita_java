class Word{

   String s [] = new String[4];

   Word(){
    s[0]="Camel";
    s[1]="tiger"; 
    s[2]="Lion";
    s[3]="Deer";
  }

    public static void main (String[] args){
  
    Word w = new Word();
    for(int i=0; i<w.s.length;i++){
    System.out.println(w.s[i]);
   }

  }
}

   
