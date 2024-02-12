package Demonstrate;

public class Tester {
    public static void main(String[] args) {
        Car myCar = new Car("saden" , 2009);
        myCar.setMaxSpeed(190);
        myCar.setNumberOfWheels(4);
        myCar.setTypeOfEngine("v6 fuel engine");
        System.out.println(myCar);
        System.out.println();


        Train myTrain = new Train(12, " bullet");
        myTrain.setNumberOfWheels(30);
        myTrain.setMaxSpeed(200);
        myTrain.setTypeOfEngine("coal engine");

        System.out.println(myTrain);

    }
}
