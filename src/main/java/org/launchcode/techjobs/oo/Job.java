package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job extends JobField{
    public Job(String value) {
        super(value);
    }
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return this.name;
    }
    @Override
    public String toString(){
            if (this.name == null) {
                this.setName("Data not available");
            }
        if (this.employer == null) {
            this.employer = new Employer("Data not available");
        }
        if (this.location == null) {
            this.location = new Location("Data not available");
        }
        if (this.positionType == null) {
            this.positionType = new PositionType("Data not available");
        }
        if (this.coreCompetency.getValue() == null) {
            this.coreCompetency = new CoreCompetency("Data not available");
        }
        return System.lineSeparator() + "ID: " + this.id + System.lineSeparator() + "Name: " + this.name + System.lineSeparator() + "Employer: " + this.employer + System.lineSeparator() + "Location: " + this.location + System.lineSeparator() + "Position Type: " + this.positionType + System.lineSeparator() + "Core Competency: " + this.coreCompetency + System.lineSeparator();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
