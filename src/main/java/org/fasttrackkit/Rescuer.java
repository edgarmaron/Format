package org.fasttrackkit;

public class Rescuer {

    String name;
    private double avalibemoney;

    Rescuer (String name1){
        name = name1;
    }

void feed (Food food, Animal animal ){
        int hunger = animal.getHunger();
        hunger = hunger - 1;
        animal.setHunger(hunger);
    System.out.println (name+" fed "+animal.getName() +" "+food.getName());
    System.out.println ("hunger level "+ animal.getHunger());

}

    void entertain (Entertainment entertainemt, Animal animal ) {
        int hapiness = animal.getHappiness();
        hapiness = hapiness + 1;
        animal.setHappiness(hapiness);
        System.out.println(name + " fed " + animal.getName() + " " + entertainemt.getName());
        System.out.println("hapiness level " + animal.getHappiness());

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
