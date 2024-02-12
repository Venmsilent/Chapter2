package Demonstrate;

public class Transportation {
    protected int NumberOfWheels;
    protected String TypeOfEngine;
    protected int MaxSpeed;


    public Transportation() {

    }

    public int getNumberOfWheels() {
        return NumberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        NumberOfWheels = numberOfWheels;
    }

    public String getTypeOfEngine() {
        return TypeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        TypeOfEngine = typeOfEngine;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return '\n' +"NumberOfWheels :" + NumberOfWheels + '\n' + " TypeOfEngine :" + TypeOfEngine + '\n' + "Maxspeed :" + MaxSpeed ;
    }
}

