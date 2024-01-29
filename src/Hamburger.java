import Enums.BreadRollType;
import java.util.Arrays;
import java.util.Objects;

public class Hamburger implements Addable{
    private String name;
    private String meat;
    private double price;
    private BreadRollType breadRollType;
    private Addition[] additions;

    public Hamburger(String name, double price, BreadRollType breadRollType) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String name, String meat, double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.additions =new Addition[4];
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void addAddition(String name, double price) {

        for(int i = 0 ; i< additions.length; i++){
            if(additions[i]!=null){
                additions[i]=new Addition(name,price);
                break;
            }

        }
    }
    public void itemizeHamburger(){
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n" );
        builder.append("Meat: " + meat + "\n");
        builder.append("Bread Roll Type: " + breadRollType+ "\n");
        for(Addition addition: additions){
            if(addition!=null){
                builder.append("Addition name: " + addition.getName());
                builder.append("Addition price: " + addition.getPrice());
                price+= addition.getPrice();
            }

        }
        System.out.println(builder);
        System.out.println("Total price: " + price);

    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRollType=" + breadRollType +
                ", additions=" + Arrays.toString(additions) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hamburger hamburger = (Hamburger) o;
        return Objects.equals(name, hamburger.name);
    }


}
