package org.fasttrackkit;

public class Dog extends Animal{

    private String toys;

    Dog (String name1){
        super (name1);

    }

    public String getToys() {
        return toys;
    }

    public void setToys(String toys) {
        this.toys = toys;
    }
}
