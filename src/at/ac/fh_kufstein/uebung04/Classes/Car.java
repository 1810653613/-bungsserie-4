package at.ac.fh_kufstein.uebung04.Classes;

import javax.swing.*;

public class Car
{
    String Color;
    Integer wheels;
    double speed;

    public void currentSpeed()
    {

        System.out.println("Die Geschwindigkeit beträgt: "+ speed + "km/h");
    }

    public Car(String Color, Integer wheels,double speed)
    {
    this.Color=Color;
    this.wheels=wheels;
    this.speed=speed;
    }

    public String getColor()
    {
        return Color;
    }

    public Integer getWheels()
    {
        return wheels;
    }

    public double getSpeed()
    {
        return speed;
    }

    public void accelerate(double geschwindigkeit)
    {
        speed=speed+geschwindigkeit;
    }

    public void slowdown(double geschwindigkeit)
    {
        speed=speed-geschwindigkeit;
    }

    public Car()
    {

    }

}
