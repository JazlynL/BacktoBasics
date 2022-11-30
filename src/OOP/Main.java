package OOP;

import OOP.Pen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // created pen class based off video.
        Pen p = new Pen();
        System.out.println(p.color);
        p.click();
        System.out.println(p.clicked);

        // created headphone class based off video.
        HeadPhones h = new HeadPhones();
        h.addControls();
        System.out.println(h.controlList);
       ;
    }
}