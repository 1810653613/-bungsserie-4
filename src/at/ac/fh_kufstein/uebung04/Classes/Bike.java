package at.ac.fh_kufstein.uebung04.Classes;

public class Bike extends Car
{
    double maxspeed;

    public Bike(String Color, Integer wheels, double speed, double maxspeed)
    {
        this.Color=Color;
        this.wheels=wheels;
        this.speed=speed;
        this.maxspeed=maxspeed;
    }

    public double getMaxspeed()
    {
        return maxspeed;
    }

    public void setMaxspeed(double m)
    {
        this.maxspeed=maxspeed+m;
    }


}
