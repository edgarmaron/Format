package org.fasttrackkit;

public class Rescuer {

    String name;
    private double avalibemoney;

    Rescuer (String name1){
        name = name1;
    }

void feed (Food food, Animal animal ){
    System.out.println (name+" fed "+animal.getClass() +" "+food.getClass());

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvalibemoney() {
        return avalibemoney;
    }

    public void setAvalibemoney(double avalibemoney) {
        this.avalibemoney = avalibemoney;
    }
}
