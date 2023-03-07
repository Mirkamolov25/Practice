public class Metro {
    public static void main(String[] args) throws Exception {
        System.out.println("Линии" + "\n");
        String url = "https://skillbox-java.github.io/";
        Lines lines = new Lines(url);
        System.out.println(lines);

        System.out.println("\n" + "Станции" + "\n");
        Stations stations = new Stations(url);
        System.out.println(stations);

        System.out.println("\n" + "Результаты поиска JSON и CSV файлов:" + "\n");
        Search search = new Search("C:/Users/Ibroh/Рабочий стол/data/");
        System.out.println(search);

        System.out.println("\n" + "Класс для парсирования JSON-файлов:" + "\n");
        JsonSimpleParser parser = new JsonSimpleParser("C:\\Users\\Ibroh\\Рабочий стол\\data\\2\\4\\depths-1.json");
        System.out.println(parser);

        System.out.println("\n" + "Класс для парсирования CSV-файлов:" + "\n");
        CsvParser parser1 = new CsvParser("C:\\Users\\Ibroh\\Рабочий стол\\data\\0\\5\\dates-2.csv");
        System.out.println(parser1);

    }
}