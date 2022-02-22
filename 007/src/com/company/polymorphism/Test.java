package com.company.polymorphism;

import java.util.Random;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Shark eats a lot of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens plan to take over the planed Earth.";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the Universe";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable movie");
    }

}

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie randomMovie = randomMovie();
            System.out.println("No. " + i + ": " + randomMovie.getName() + ": " + randomMovie.plot());
        }
    }

    public static Movie randomMovie() {
        int movieIndex = new Random().nextInt(5);
        switch (movieIndex) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            default:
                return new ForgettableMovie();
        }
    }
}


















