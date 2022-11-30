package OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeadPhones {

    public String charge = "Micro Usb";
    public String [] controls = {"Power","Volume","skip","play/pause"};

    // created an array list
    public List<String> controlList = new ArrayList<>();

    String color = "Red/black";
    public boolean power = false;
    public int volume = 0;


    public void addControls(){
        controlList.addAll(Arrays.asList(controls));
    }

    public  void powerOn(){
        power = true;
    }
    public   void powerOff(){
        power = false;
    }
    public void volumeUp(){
        volume++;
    }
    public void volumeDown(){
        volume--;
    }
}
