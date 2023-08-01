package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        switch(monthNumber){
            case 1:
                System.out.println("Winter");
            case 2:
                System.out.println("Spring");
            case 3:
                System.out.println("Summer");
            case 4:
                System.out.println("Fall");
            default:
                System.out.println("Wrong month number");
        }
    }

}
