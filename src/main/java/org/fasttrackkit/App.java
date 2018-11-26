package org.fasttrackkit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Entertainment goingout = new Entertainment("goingout");
        Entertainment cleaning = new Entertainment("CleaningBox");

        Food Bacon = new Food("Bacon");
        Bacon.price = 10;

        Food Fish = new Food ("Fish");
        Fish.price = 15;
        
        Dog Spike = new Dog("Spike");
        Cat Miles = new Cat("Miles");

        Rescuer John = new Rescuer("John");
        John.feed(Bacon,Spike);
        goingout.activity(John,Spike);
        John.avalibemoney = 300;


        Rescuer Fred = new Rescuer("Fred");
        Fred.feed(Fish,Miles);
        cleaning.activity(Fred,Miles);



    }


}