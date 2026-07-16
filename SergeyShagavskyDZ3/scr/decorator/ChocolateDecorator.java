package decorator;

public class ChocolateDecorator extends CoffeeDecorator {

    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + шоколад";
    }

    @Override
    public int getCost() {
        return coffee.getCost() + 50;
    }

}