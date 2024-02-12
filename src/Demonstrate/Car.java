package Demonstrate;

public class Car extends Transportation{
    private String model;
    private int Year;

    public Car(String model, int year) {
        super();
        this.model = model;
        Year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "Car : " + model + Year + super.toString() ;
    }
}

