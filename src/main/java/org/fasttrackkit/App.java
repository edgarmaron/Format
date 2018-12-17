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
        
        Dog spike = new Dog("Spike");
        spike.joy();

        Cat Miles = new Cat("Miles");
        Miles.joy();

        Rescuer john = new Rescuer("John");
        john.feed(Bacon,spike);
        goingout.activity(john,spike);
        john.setAvalibemoney(300);

        john.entertain(goingout, spike);


        Rescuer Fred = new Rescuer("Fred");
        Fred.feed(Fish,Miles);
        cleaning.activity(Fred,Miles);



    }


}