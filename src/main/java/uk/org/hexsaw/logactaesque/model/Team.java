package uk.org.hexsaw.logactaesque.model;

public class Team {

    private String name;

    private String shortName;

    public Team(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

}
