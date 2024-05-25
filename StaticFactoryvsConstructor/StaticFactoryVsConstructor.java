package StaticFactoryvsConstructor;

public class StaticFactoryVsConstructor {

    public static void main(String[] args) {

        //This is the usual usage of food class.
        Food food = new Food("Usual Food");

        //This allows us to create instances with the help of meaningful static factory methods.
        Food coldFood = Food.coldFood("Ice Cream");
        Food hotFood = Food.hotFood("Steak");
        //If we have lots of parameters in out constructor, we can manage them by static factory methods.
        //If we have lots of constructors we can make a mistake when selecting the right one,
        //but with the static factory methods we can select the static methods by names.

    }
}
