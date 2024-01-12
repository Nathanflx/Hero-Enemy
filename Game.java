package game;

public class Game {

    public static void main(String[] args) {
        //Buat Objek
        Player Hero = new Player();
         Enemy = new Enemy();
        
        //Memberi Nama Atribut
        Enemy.name = "HanzSonitzu ";
        Enemy.Armor = 100;
        Enemy.Damage = -30;
        Enemy.healthpoin = 200;
        Enemy.speed = 40;
        
        Enemy.run();
        Hero.Attack();
        
        Hero.name = "Djoko Chandra ";
        Hero.speed = 50;
        Hero.healthpoin = 200;
        Hero.Armor = 100;
        Hero.Damage = -300;
        if(Hero.Attack()){
            Enemy.healthpoin = -300;
        }
        
        
        Hero.run();
        
        if(Enemy.isDead()){
            System.out.println(Enemy.name+"MANTABBB");
        }
        if(Hero.isDead()){
            System.out.println(Hero.name+"Game Over dekk!!");
        }
       
    }
    
}
