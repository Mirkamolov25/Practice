public class Basket {

    public static int countProduct = 0;
    public static int GeneralTotalPrice = 0;
    private static int count = 0;
    private String items = "";
    private static int totalPrice = 0;
    private double totalWeight = 0;
    private int limit;

    public Basket() {
        increaseCount(1);
        items = "";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        increaseCount(1);
        this.items = this.items + items;
        Basket.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price, int count, double weight) {
        totalWeight += weight;
        add(name, price, count);
        sumTotalPrice();
        sumCountProduct(count);
    }
    public void add(String name, int price) {
        add(name, price);
        sumTotalPrice();
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        getTotalWeight();
        if (contains(name)) {
            error = true;
        }
        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        sumTotalPrice();
        sumCountProduct(count);

    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public static void sumTotalPrice() {
        GeneralTotalPrice += totalPrice;
    }
    public static void sumCountProduct(int count) {
        countProduct += count;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
    public double getTotalWeight() {
        return totalWeight;
    }

    public static int isAveragePriceProduct() {
        return GeneralTotalPrice / countProduct;
    }
    public static int isAveragePriceBasket() {
        return GeneralTotalPrice / count;
    }
}
