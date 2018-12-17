package org.fasttrackkit;

public class Cat extends Animal {

    private String box;


    public Cat(String name1) {
        super(name1);

    }
    void joy (){
        System.out.println(getName()+"purring");
    }
    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }


}
