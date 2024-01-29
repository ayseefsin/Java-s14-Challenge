import Enums.BreadRollType;
import Enums.CipsType;

public class DeluxeBurger extends Hamburger{
    private Cips cips;
    private Drink drink;

    public DeluxeBurger(Drink drink, Cips cips) {
        super("Deluxe Burger", "Double", 19.10, BreadRollType.DOUBLE_BURGER);
        this.cips = cips;
        this.drink = drink;
    }


    @Override
    public void addAddition(String name, double price) {
        System.out.println("You cannot add additional items to deluxe burger!");
    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();

        builder.append("Drink: " + drink.getDrinkType()+"\n");
        builder.append("Chips: " + cips.getCipsType()+ "\n");
        System.out.println(builder);
        super.itemizeHamburger();
    }
}
