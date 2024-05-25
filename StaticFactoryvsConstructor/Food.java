package StaticFactoryvsConstructor;

public class Food {

    private String name;

    public Food(String name) {
        this.name = name;
    }

    public static Food coldFood(String coldFoodName){
        return new IceCream(coldFoodName);
    }

    public static Food hotFood(String hotFoodName){
        return new Steak(hotFoodName);
    }
}
