package src.ru.itmo.java.basics.practic3;

import java.time.LocalDate;

public class Home {
    private int floor;
    private int yearBuilt;
    private String name;
    public Home (int floor, int yearBuilt, String name){
        this.floor = floor;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }

    public int printFloor(){
        return this.floor;
    }
    public int printYearBuilt(){
        return this.yearBuilt;
    }
    public String printName(){
        return this.name;
    }
    public int yearsSinceBuilt(){
        int currentYear = LocalDate.now().getYear();
        return currentYear - yearBuilt;
    }


    public static void main(String[] args){
        Home home1 = new Home(14,2001,"Home1");
        Home home2 = new Home(25,2015,"Home2");
        System.out.println(home1.printFloor());
        System.out.println(home1.printYearBuilt());
        System.out.println(home1.printName());
        System.out.println(home1.yearsSinceBuilt());
        System.out.println(home2.printFloor());
        System.out.println(home2.printYearBuilt());
        System.out.println(home2.printName());
        System.out.println(home2.yearsSinceBuilt());
    }
}
