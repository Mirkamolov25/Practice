public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Молоко", 50, 2);
        basket.add("Кефир", 90, 3);
        basket.add("Сыр", 450, 1);
        basket.print("Список товаров: ");
        basket.clear();
        Basket basket1 = new Basket();
        basket.add("Печенье", 60, 3);
        basket.add("Мука", 80, 2);
        basket.print("Список товаров: ");
        basket.clear();
        basket.print("");
        System.out.println(Basket.countProduct);
        System.out.println(Basket.GeneralTotalPrice);
        System.out.println(Basket.isAveragePriceBasket());
        System.out.println(Basket.isAveragePriceProduct());



    }
}
