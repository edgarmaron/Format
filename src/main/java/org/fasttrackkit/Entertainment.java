package org.fasttrackkit;

public class Entertainment {

    private String name;

    Entertainment (String name1){
        name = name1;

    }
    void activity (Rescuer rescuer,Animal animal){
        System.out.println (rescuer.name+" "+"is" +" "+name+" with "+animal.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
