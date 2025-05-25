package mocking.beeceptorPojo;

import java.util.List;

public class Departments {
    private String name;
    private int budget;
    private List<Teams> teams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public List<Teams> getTeams() {
        return teams;
    }

    public void setTeams(List<Teams> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", teams=" + teams +
                '}';
    }
}
