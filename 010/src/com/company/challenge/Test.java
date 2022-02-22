package com.company.challenge;

public class Test {
    public static void main(String[] args) {

        System.out.println(reverseString("Milan Vujanic"));
//        BasketballTeam basketballTeam = new BasketballTeam("Chicago Bulls", 10);
//        BasketballTeam basketballTeam2 = new BasketballTeam("New York Nicks", 8);
//        BasketballTeam basketballTeam3 = new BasketballTeam("Phoenix Suns", 7);
//
//        League<BasketballTeam> basketballTeamLeague = new League<>("NBA");
//        basketballTeamLeague.addTeam(basketballTeam);
//        basketballTeamLeague.addTeam(basketballTeam2);
//        basketballTeamLeague.addTeam(basketballTeam3);
//        basketballTeamLeague.printTable();
//
//        PingPongTeam pingPongTeam = new PingPongTeam("China team", 100);

    }

    private static String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.substring(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
}
