package at.ac.fh_kufstein.uebung04.Classes;

import javax.swing.*;

public class Car
{
    String Color;
    Integer wheels;
    double speed;

    public void currentSpeed()
    {
        JOptionPane.showMessageDialog(null,"Die Geschwindigkeit beträgt: "+ speed);
    }

    public Car(String Color, Integer wheels,double speed)
    {
    this.Color=Color;
    this.wheels=wheels;
    this.speed=speed;
    }


}
