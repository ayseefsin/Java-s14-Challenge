import Enums.BreadRollType;

public class HealthyBurger extends Hamburger implements Addable{
    private Addition healthyAddition1;
    private Addition healthyAddition2;

    public HealthyBurger(String name,  double price, BreadRollType breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public Addition getHealthAddition1() {
        return healthyAddition1;
    }

    public Addition getHealthAddition2() {
        return healthyAddition2;
    }

    @Override
    public void addAddition(String name, double price) {
        if(healthyAddition1==null){
            healthyAddition1 = new Addition(name,price);
        }else if (healthyAddition2==null){
            healthyAddition2= new Addition(name,price);
        }

    }

    @Override
    public void itemizeHamburger() {
        StringBuilder builder = new StringBuilder();
     if(healthyAddition1!=null){
         builder.append("Healthy Addition 1: ").append(getHealthAddition1().getName()).append("\n");
         setPrice(getHealthAddition1().getPrice() + getPrice());
     }
     if(healthyAddition2!=null){
         builder.append("Healthy Addition 2: ").append(getHealthAddition2().getName()).append("\n");
         setPrice(getHealthAddition2().getPrice()+getPrice());
     }
     System.out.println(builder);
     super.itemizeHamburger();

    }
}
