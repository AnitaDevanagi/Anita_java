class Testlanguage{
public static void main(String[] args){

    Language ab = new Language("java");
       ab.understand();

   String[] character ={"Robust","portable","Secure","Independant"};
    
    Language kg = new Language("java","James Gosling",1995,"Oracle",13000000, character);
     kg.understand();
 
   }
}