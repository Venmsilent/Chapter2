package Demonstrate;

public class Train extends Transportation {
    private int NumberOfCarts;
    private String model;

    public Train(int numberOfCarts, String model) {
        super();
        NumberOfCarts = numberOfCarts;
        this.model = model;
    }

    public int getNumberOfCarts() {
        return NumberOfCarts;
    }

    public void setNumberOfCarts(int numberOfCarts) {
        NumberOfCarts = numberOfCarts;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Train:" + NumberOfCarts  + model + super.toString() ;
    }
}

