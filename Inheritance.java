//This program is an Example of Inheritance

class Bicycle
{
    public int gear;
    public int speed;

    Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }
    public void applybreak(int decrement)
    {
        speed = speed - decrement;
    }
    public void speedup(int increment)
    {
        speed = speed + increment;
    }
    public String toString()
    {
        return ("Number of Gears = "+gear+"\n"+"Speed of bicycle = "+speed);
    }
}

class MountainBike extends Bicycle
{
    public int seatheight;

    MountainBike(int gear,int speed,int startheight)
    {
        super(gear, speed);
        seatheight = startheight;
    }
    public void setheight(int newvalue)
    {
        seatheight = newvalue;
    }
    public String toString()
    {
        return (super.toString()+"\nSeat Height = "+seatheight);
    }
}

public class Inheritance {
    public static void main(String args[])
    {
        MountainBike mBike = new MountainBike(3,95,20);
        System.out.println(mBike.toString());
    }
}