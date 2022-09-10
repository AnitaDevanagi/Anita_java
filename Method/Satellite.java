class Satellite{
    String name;
    int lunched;
    int cost;
    String [] types;
    
    

 Satellite(String name){
  this.name=name;
 }

  Satellite(String name,int lunched, int cost,String [] types){
  this.name=name;
  this.lunched=lunched;
  this.cost=cost;
  this.types=types;

 }
  
   void communicate(){
   System.out.println(name+"\t"+lunched+"\t"+cost+"\t"+types);
   if(types!=null){
   for(int i=0;i<types.length;i++){
   System.out.print(types[i]);
  }
 }
}

   public static void main(String [] args){
   Satellite a = new  Satellite("Mars Orbiter Mission");
    a.communicate();

    String [] types={"Natural ", "Man made"};
    Satellite c = new  Satellite("Mars Orbiter Mission", 2013, 450, types);
     c.communicate();
  }
}