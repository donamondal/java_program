package Clg_exmple;

public class Main3 
{
	boolean isOn;
	 
    void turnOn() {
        // initialize variable with value true
        isOn = true;
        System.out.println("Light on? " + isOn);
 
    }
 
    void turnOff() {
        // initialize variable with value false
        isOn = false;
        System.out.println("Light on? " + isOn);
    }
}
 
class Lamp {
    public static void main(String[] args) {
  
        // create objects l1 and l2
        Main3 l1 = new Main3();
        Main3 l2 = new Main3();
  
        // call methods turnOn() and turnOff()
        l1.turnOn();
        l2.turnOff();
    }

}
