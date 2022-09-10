class Language {
     String name;
     String developed;
     int year;
     String   adopt;
     String [] character;
     int  devicesuse;

     Language(String name){
     this.name=name;
    }

    Language(String name,String developed,int year,String adopt,int  devicesuse,String [] character){
     this.name=name;
     this.developed=developed;
     this.year=year;
     this.adopt=adopt;
     this.character=character;
     this.devicesuse=devicesuse;
}

       void understand(){
       System.out.println(name+"\t"+developed+"\t"+year+"\t"+adopt+"\t"+devicesuse+"\t"+ character);
       if(character !=null){
       for (int i=0;i<character.length;i++){
       System.out.print(character[i]);
       }
     }
  }
}
  
     
     