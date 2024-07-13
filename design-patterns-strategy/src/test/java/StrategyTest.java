import org.junit.Test;
import pers.lilpen.design.stratetgy.duck.impl.RocketDuck;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/13 22:37
 */
public class StrategyTest {
    @Test
    public void test_duck_strategy() {
        RocketDuck rocketDuck = new RocketDuck();
        rocketDuck.display();
        rocketDuck.fly();
    }
}
