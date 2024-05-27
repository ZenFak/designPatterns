package main.java.neoflex.factory;

public class CoffeeMaking {
    public Coffee getCoffe(CoffeType coffeType) {
        Coffee coffee;
        switch (coffeType) {
            case ESPRESSO:
                coffee = new Espresso();
                break;
            case AMERICANO:
                coffee = new Americano();
                break;
            default:
                throw new IllegalArgumentException("Выбранного типа не существует");
        }
        return coffee;
    }
}
