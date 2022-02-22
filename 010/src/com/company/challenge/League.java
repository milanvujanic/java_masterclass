package com.company.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

    private String name;
    private List<T> teams;

    public League(String name) {
        this.name = name; this.teams = new ArrayList<>();
    }

    public void addTeam(T team) {
        this.teams.add(team);
    }

    public void printTable() {
        Collections.sort(teams);
        System.out.println(teams);
    }
}
