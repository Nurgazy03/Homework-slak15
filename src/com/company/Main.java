package com.company;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Nurgazy","developer","Peacksoft");
        System.out.println(programmer);
         programmer.learn();
         programmer.walk();
         programmer.eat();
         programmer.coding();

       // Person person = new Programmer("");
        System.out.println("----------------------------------------------------");

        Dancer dancer = new Dancer("Micheal","Dancing","BombStars");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();

        System.out.println("----------------------------------------------------");

        Singer singer = new Singer("Victor","singing","OneFeel");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();





    }
}

