package chapter1;
/**
 * Toy object
 * has a properties of name, brand, price, quantity
 * with a Toy.setPrice
 * though it invokes {@link #setPrice(double)} and then 
    *{@link #println()} 
    *
    *@param x The{@code String} to be printed.
*
 */
public class Toy {
    String name;
    String brand;
    double price;
    int quantity;
    
    void setPrice(double price){
        this.price = price;
    }


    public static void main(String[] args) {
        Toy toy1 = new Toy();
        Toy toy2 = new Toy();
        toy1.name = "Barbie";
        toy1.brand = "Mattel";
        toy1.price = 1200;
        toy1.quantity=12;

        toy2.name = "Gel blaster";
        toy2.brand = "Armscore";
        toy2.price = 999;
        toy2.quantity=8;

        //toy1.price = 1500;
        toy1.setPrice(1500);
        System.out.println(toy1.price);
        System.out.println(toy2.price);        
    }

}

@SuppressWarnings("unused")
class Fish{

}
@SuppressWarnings("unused")
class Fish2{

}
@SuppressWarnings("unused")
class Fish3{

}
@SuppressWarnings("unused")
class Fish4{

        public static void main(String[] args) {
            Toy toy3 = new Toy();
            Fish2 f2 = new Fish2();
            System.out.println("I am Fish!!");
        }
    }
