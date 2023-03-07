package pack;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        char yo = 'Ё';
        char yoM = 'ё';
        int num_A = (int) 'А';
        int num_ya = (int) 'я';
        for (int i = num_A; i < num_ya + 1; i++) {
            char b = (char) i;
            System.out.println(b);
            if (b == 'Е') {
                System.out.println(yo);
            }
            if (b == 'е') {
                System.out.println(yoM);
            }
        }


    }
}
