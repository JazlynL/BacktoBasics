package Inheritance;

import OOP.HeadPhones;
import OOP.Pen;

/*Inheritance is using methods and properties from a generic class
 using it in different ways*/

public class Main {
    public static void main(String[] args) {
     Mouse1 m1 = new Mouse1();

     m1.leftClick();
     m1.rightClick();
     m1.scrollDown();
     m1.scrollUp();

     Mouse2 m2 = new Mouse2();

     m2.connect();
    }
}
