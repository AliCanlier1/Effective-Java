package BuilderPattern;

public class BuilderPattern {

    //If we have a class with a lot of parameters, creating this class can be difficult.
    //We can use more than one constructor to solve this problem or setting them by setters.
    //But builder pattern handles this convenient way.
    //Builder class sets its attributes by different methods.
    Starbucks starbucks = new Starbucks.Builder("small").notSoft().withLactose(5).build();

}
