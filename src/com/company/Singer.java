package com.company;

public class Singer extends Person {

    private String groupName;

    public Singer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void singing() {
        System.out.println(super.getName()+" singing to satisfy himself and the audience");
    }
    public void playGitar() {

        System.out.println(super.getName()+" play gitar becouse of he love it");
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    @Override
    public String toString() {
        return "Singer's " +
                "groupName : " + groupName + '\'' +
                " " + super.toString();
    }
}
