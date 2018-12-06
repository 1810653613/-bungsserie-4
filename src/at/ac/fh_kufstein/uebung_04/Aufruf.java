package at.ac.fh_kufstein.uebung_04;

import at.ac.fh_kufstein.uebung04.Classes.Bike;
import at.ac.fh_kufstein.uebung04.Classes.Car;

public class Aufruf
{
    public static void main (String[]args)
    {
        Car neu= new Car("red",4,200);
        neu.currentSpeed();
        Bike Mountain=new Bike("blau",2,20,40);
        Mountain.accelerate(10);
        Mountain.currentSpeed();

    }

}
