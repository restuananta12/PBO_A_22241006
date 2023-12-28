 package com.tutorial;



class hero {
    // Attribut
     String nama;
     float exp;
     float health;
  
     
     void dispaly(){
       System.out.println("Nama Hero :"+ this.nama);
       System.out.println(" exp Hero : "+ this.exp);
       System.out.println("health Hero :"+ this.health);

     }
   
}
  // subclass
class HeroTank extends hero{


}
 public class Main {
  public static void main(String[] args) {
    // instansiasi objek
    hero hero_1 = new hero();
    hero_1.nama ="anna";
   hero_1.dispaly();


      HeroTank hero_2 = new HeroTank();
     hero_2.nama ="kim taehyumg";
     hero_2.dispaly();}

  
 }

  
 

        

    
 