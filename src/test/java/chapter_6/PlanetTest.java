package chapter_6;

import org.junit.Test;

public class PlanetTest {

    @Test
    public void enumTest() {
        double earthWeight = 12.2;
        double mass = earthWeight / Planet.MERCURY.surfaceGravity();
        for(Planet p : Planet.values())
            System.out.printf("Weight on %s is %f",
                    p, p.surfaceWeight(mass));
    }

    @Test
    public void operionTest() {
        double x = 11.1;
        double y = 22.2;
        for(Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }

    @Test
    public void payrollDayTest() {
    }
}
