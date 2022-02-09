package com.company;

public class Programmer extends Person  {

    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    static void coding () {

        System.out.println("coding to achive succes");
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer's " +
                "companyName : " + companyName + '\'' +
                " " + super.toString();
    }
}
