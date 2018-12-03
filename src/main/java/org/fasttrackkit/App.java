package org.fasttrackkit;

public class App 
{
    public static void main( String[] args )
    {
        Entertainment goingout = new Entertainment("goingout");
        Entertainment cleaning = new Entertainment("CleaningBox");

        Food Bacon = new Food("Bacon");
        Bacon.setPrice(10);

        Food Fish = new Food ("Fish");
        Fish.setPrice(15);
        
        Dog Spike = new Dog("Spike");
        Cat Miles = new Cat("Miles");

        Rescuer john = new Rescuer("John");
        john.feed(Bacon,Spike);
        goingout.activity(john,Spike);
        john.setAvalibemoney(300);


        Rescuer Fred = new Rescuer("Fred");
        Fred.feed(Fish,Miles);
        cleaning.activity(Fred,Miles);



    }


}