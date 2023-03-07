import java.io.IOException;
import java.util.Scanner;
import org.apache.logging.log4j.*;

public class Main {
    private static final String ADD_COMMAND = "add Василий Петров " +
            "vasily.petrov@gmail.com +79215637722";
    private static final String COMMAND_EXAMPLES = "\t" + ADD_COMMAND + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static final String COMMAND_ERROR = "Wrong command! Available command examples: \n" +
            COMMAND_EXAMPLES;
    private static final String helpText = "Command examples:\n" + COMMAND_EXAMPLES;
    private static final Logger logger = LogManager.getLogger(Main.class);
    private static final Marker INPUT_HISTORY = MarkerManager.getMarker("INPUT_HISTORY");
    private static final Marker INVALID_ERROR = MarkerManager.getMarker("INVALID_ERROR");

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();
        while (true) {
            try {
                String command = scanner.nextLine();
                String[] tokens = command.split("\\s+", 2);
                if (tokens[0].equals("add")) {
                    logger.info(INPUT_HISTORY, "Пользователь попытался добавить информацию: " + tokens[1]);
                    executor.addCustomer(tokens[1]);
                } else if (tokens[0].equals("list")) {
                    logger.info(INPUT_HISTORY, "Пользователь попытался посмотреть список добавленных работников");
                    executor.listCustomers();
                } else if (tokens[0].equals("remove")) {
                    logger.info(INPUT_HISTORY, "Пользователь попытался удалить данные о сотруднике: " + tokens[1]);
                    executor.removeCustomer(tokens[1]);
                } else if (tokens[0].equals("count")) {
                    logger.info(INPUT_HISTORY, "Пользователь попытался посмотреть общее число добавленных сотрудников");
                    System.out.println("There are " + executor.getCount() + " customers");
                } else if (tokens[0].equals("help")) {
                    logger.info(INPUT_HISTORY, "Пользовател попытался посмотреть список возможных команд");
                    System.out.println(helpText);
                } else {
                    System.out.println(COMMAND_ERROR);
                }
            }
            catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                logger.error(INVALID_ERROR, "Ошибка " + ex);
            }
        }
    }
}
