package Inheritance;

import javax.swing.*;

public class Reptile extends Animal{
    private boolean layEggs;
    private String color;
    private boolean hasVenom;
    private boolean coldBlooded;

    public Reptile(boolean coldBlooded){
        this();
        this.coldBlooded = coldBlooded;
    }

    public Reptile() {
        super(true,0,"Carnivore");
        this.layEggs = false;
        this.hasVenom = true;
        this.color = "red";
        this.coldBlooded = true;
    }

    public Reptile(boolean layEggs, String color, boolean hasVenom){
        super(true, 0, "Carnivore");
        this.color = color;
        this.layEggs = layEggs;
        this.hasVenom = hasVenom;
    }


    @Override
    public void eat(){
        super.eat();
        System.out.println(" Yummy");
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println(" sssssss");
    }
}
