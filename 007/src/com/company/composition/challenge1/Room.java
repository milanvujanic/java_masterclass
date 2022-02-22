package com.company.composition.challenge1;

public class Room {

    private Wall wall;
    private Furniture furniture;

    public Room(Wall wall, Furniture furniture) {
        this.wall = wall;
        this.furniture = furniture;
    }

    public void drawOnTheWall(String color) {
        wall.draw(color);
    }

    public void rearrangeChairs(int numberOnTheLeft, int numberOnTheRight) {
        furniture.positionChairs(numberOnTheLeft, numberOnTheRight);
    }

    public Wall getWall() {
        return wall;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public static Builder Builder() {
        return new Builder();
    }

    public static class Builder {
        private Furniture furniture;
        private Wall wall;

        public Builder furniture(Furniture furniture) {
            this.furniture = furniture;
            return this;
        }

        public Builder wall(Wall wall) {
            this.wall = wall;
            return this;
        }

        public Room build() {
            return new Room(this.wall, this.furniture);
        }
    }
}
