package main.java.neoflex.factory;

public class Facility {
    public Facility(){}

    public void start(CoffeType coffeType){
        CoffeeMaking coffeeMaking = new CoffeeMaking();
        Coffee coffee = coffeeMaking.getCoffe(coffeType);
        System.out.println("Выбрано кофе: " + coffeType);
        System.out.println("Приготовление " + coffeType + " началось");
    }
}
