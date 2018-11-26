package org.fasttrackkit;

public class Entertainment {

    String name;

    Entertainment (String name1){
        name = name1;

    }
    void activity (Rescuer rescuer,Animal animal){
        System.out.println (rescuer.name+" "+"is" +" "+name+" with "+animal.name);
    }
}
