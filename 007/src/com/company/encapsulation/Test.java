package com.company.encapsulation;

public class Test {
    public static void main(String[] args) {

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Milan", 200, "Sword");
        System.out.println("Initial helth is: " + enhancedPlayer.getHitPoints());

//        Player player = new Player();
//        player.fullName = "Milan";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemaining());
    }
}
