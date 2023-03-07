package Exersice2;

public class InformationForCourierService {
    Dimensions dimensions = new Dimensions();
    private final int weight;
    private final String deliveryAddress;
    private final boolean hasFlipped;
    private final String registrationNumber;
    private final boolean hasFragile;

    public InformationForCourierService(Dimensions dimensions, int weight,
                                        String deliveryAddress, boolean hasFlipped,
                                        String registrationNumber, boolean hasFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.hasFlipped = hasFlipped;
        this.registrationNumber = registrationNumber;
        this.hasFragile = hasFragile;
    }
    public InformationForCourierService setWeight(int weight) {
        return new InformationForCourierService(dimensions, weight, deliveryAddress,
                hasFlipped, registrationNumber, hasFragile);
    }
    public InformationForCourierService setDeliveryAddress(String deliveryAddress) {
        return new InformationForCourierService(dimensions, weight, deliveryAddress,
                hasFlipped, registrationNumber, hasFragile);
    }
    public InformationForCourierService setDimensions(Dimensions dimensions) {
        return new InformationForCourierService(dimensions, weight, deliveryAddress,
                hasFlipped, registrationNumber, hasFragile);
    }
    public void getInformation() {
        System.out.println("Габариты: " + dimensions.volumeDimensions());
        System.out.println("Вес: " + weight);
        System.out.println("Адрес: " + deliveryAddress);
        System.out.print("Можно ли переварачивать: ");
        System.out.println(hasFlipped?"Да":"Нет");
        System.out.println("Регистрационный номер: " + registrationNumber);
        System.out.print("Является ли груз хрупким: ");
        System.out.println(hasFragile?"Да":"Нет");

    }





}
