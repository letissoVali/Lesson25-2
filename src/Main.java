import ru.valiullin.Basket;
import ru.valiullin.impBasket;

public class Main {

    public static void main(String[] args) {
        Basket implBasket = new impBasket();
        System.out.println(implBasket.getProducts());

        implBasket.addProduct("Coffee",3);
        implBasket.addProduct("Tea",1);
        implBasket.addProduct("Cookies",2);
        implBasket.addProduct("Buns",5);
        implBasket.addProduct("Cake",3);

        System.out.println(implBasket.getProducts());

        implBasket.updateProductQuantity("Coffee",2);
        implBasket.updateProductQuantity("Buns",6);
        implBasket.removeProduct("Tea");

        System.out.println(implBasket.getProducts());
        implBasket.updateProductQuantity("Bunnies",2);
        implBasket.updateProductQuantity("Koffee",2);

        System.out.println("Получение количества товаров по названию");
        System.out.println("Количество "+implBasket.getProductQuantity("Coffee"));
        System.out.println("Количество "+implBasket.getProductQuantity("Buns"));

        implBasket.clear();
        System.out.println("Clean order list. Print cleaned order list");
        System.out.println(implBasket.getProducts());
    }
}
