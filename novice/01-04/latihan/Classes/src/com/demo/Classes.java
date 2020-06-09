package com.demo;

public class Classes {

    // the Bicycle class has
    // three fields
    public int cadence;
    public int gear;
    public int speed;

    // the Bicycle class has
    // one constructor
    public Classes(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }

    // the Bicycle class has
    // four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public static void main(String[]args){

    }

    public class MountainBike extends Classes {

        // the MountainBike subclass has
        // one field
        public int seatHeight;

        // the MountainBike subclass has
        // one constructor
        public MountainBike(int startHeight, int startCadence,
                            int startSpeed, int startGear) {
            super(startCadence, startSpeed, startGear);
            seatHeight = startHeight;
        }

        // the MountainBike subclass has
        // one method
        public void setHeight(int newValue) {
            seatHeight = newValue;
        }
    }
}