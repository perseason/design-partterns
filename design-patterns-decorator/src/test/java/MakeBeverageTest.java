import org.junit.Test;
import pers.lilpen.design.decorator.beverage.BeverageSize;
import pers.lilpen.design.decorator.beverage.impl.Espresso;
import pers.lilpen.design.decorator.beverage.impl.MilkTea;
import pers.lilpen.design.decorator.condiment.impl.Coconut;
import pers.lilpen.design.decorator.condiment.impl.Milk;
import pers.lilpen.design.decorator.condiment.impl.Mocha;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/14 21:21
 */
public class MakeBeverageTest {
    @Test
    public void test_makeEspresso() {
        Espresso espresso = new Espresso(BeverageSize.TAIL);
        Milk milk = new Milk(espresso);
        Mocha mocha = new Mocha(milk);
        System.out.println(mocha.getDescription());
        System.out.println(mocha.cost());
    }

    @Test
    public void test_makeMilkTea() {
        MilkTea milkTea = new MilkTea(BeverageSize.VENTI);
        Coconut coconut = new Coconut(milkTea);
        System.out.println(coconut.getDescription());
        System.out.println(coconut.cost());
    }
}
