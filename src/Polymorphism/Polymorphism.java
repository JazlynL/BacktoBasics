package Polymorphism;

import OOP.HeadPhones;
import OOP.Pen;
class Bird{
    public void sing(){
        System.out.println("Tweety dee");
    }
}
class Robin extends Bird{
    public void sing(){
        System.out.println("Twiddle dee dee");
    }
        }
        class Pelican extends  Bird{
            public void sing(){
                System.out.println("Quahhh Quahhh");
            }
        }


public class Polymorphism {
    public static void main(String[] args) {
        //

        Bird b = new Bird();
        b.sing();
        Robin b2 = new Robin();
        b2.sing();
    }

}
