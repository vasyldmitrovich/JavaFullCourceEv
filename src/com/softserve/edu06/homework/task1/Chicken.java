package com.softserve.edu06.homework.task1;

public class Chicken extends NonFlyingBird{
    private String type;
    public Chicken() {
    }

    public Chicken(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

//    public String getType() {
//        return type;
//    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        super.fly();
    }

    /*When I will be printing info about chicken I would not see variable type from this class*/
    @Override
    public String toString() {
        return super.toString();
    }

}
