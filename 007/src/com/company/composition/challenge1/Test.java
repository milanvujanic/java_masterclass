package com.company.composition.challenge1;

public class Test {
    public static void main(String[] args) {

        Chair chair = new Chair(4, "used", "brown");
        Table table = new Table(10, 20, 30, "dinner");
        Furniture furniture = new Furniture("new", chair, table);

        Wall wall = new Wall(40, 50, "white");

        Room room = Room.Builder().furniture(furniture).wall(wall).build();

        room.getWall().draw("blue");
        room.getFurniture().positionChairs(2, 3);
        System.out.println("-------------------------------------");
        room.drawOnTheWall("Green");
        room.rearrangeChairs(5, 5);
    }
}
