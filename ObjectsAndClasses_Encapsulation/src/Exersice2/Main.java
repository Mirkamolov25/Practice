package Exersice2;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(5, 8, 9);
        InformationForCourierService order = new InformationForCourierService(dimensions, 50, "Ленинский проспект дом 123", true,
                                                                                "AA1012932", true);
        order.getInformation();
        //изменение данных путем создания копии
        order = order.setDeliveryAddress("Бережковская набережная дом 12");
        order = order.setWeight(90);
        order = order.setDimensions(new Dimensions(10, 5, 22));
        System.out.println();
        order.getInformation();


        Elevator elevator = new Elevator(-3, 26);
        /*
        while (true) {
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
         */

        //Для запуска 1-й задачи расскомментируйте цикл.
    }
}
