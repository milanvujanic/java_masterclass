package com.company.challenge;

public abstract class Team implements Comparable<Team> {

    private String name;
    private int points;

    public Team(String name, int points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public int compareTo(Team team) {
        return points > team.getPoints() ? -1 : points < team.getPoints() ? 1 : 0;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}
