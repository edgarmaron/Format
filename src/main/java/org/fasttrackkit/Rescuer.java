package org.fasttrackkit;

public class Rescuer {

    String name;
    double avalibemoney;

    Rescuer (String name1){
        name = name1;
    }

void feed (Food food, Animal animal ){
    System.out.println (name+" fed "+animal.name +" "+food.name);

}


}
