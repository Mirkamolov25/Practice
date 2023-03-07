import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class RouteCalculatorTest extends TestCase {
    List<Station> route;
    @Override
    protected void setUp() throws Exception {
        route = new ArrayList<>();
        Line red = new Line(1, "Сокольническая линия");
        Line green = new Line(2, "Замоскворецкая линия");
        Line blue = new Line(3, "Арбатско-Покровская линия");
        Line orange = new Line(4, "Калужско-Рижская");
        route.add(new Station("Театральная", green));
        route.add(new Station("Новокузнецкая", green));
        route.add(new Station("Охотный ряд", red));
        route.add(new Station("Библиотека имени Ленина", red));
        route.add(new Station("Площадь Революции", blue));
        route.add(new Station("Арбатская", blue));
        route.add(new Station("Третьяковская", orange));
        route.add(new Station("Тургеневская", orange));
    }
    public void testCalculateDuration(){
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 20.5;
        assertEquals(expected, actual);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
