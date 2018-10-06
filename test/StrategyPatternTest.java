import org.junit.Test;
import StrategyPattern.StrategyPattern;
import StrategyPattern.AddOperation;
import StrategyPattern.DivisionOperation;
import StrategyPattern.MultiplyOperation;
import static org.junit.Assert.assertEquals;

public class StrategyPatternTest {
    @Test
    public void addTest(){
        StrategyPattern add = new StrategyPattern(new AddOperation());
        assertEquals(5, add.executeStrategy(2,3));
    }

    @Test
    public void multiplyTest(){
        StrategyPattern multiply = new StrategyPattern(new MultiplyOperation());
        assertEquals(4,multiply.executeStrategy(2,2));
    }
    @Test
    public void divideTest(){
        StrategyPattern divide = new StrategyPattern(new DivisionOperation());
        assertEquals(3, divide.executeStrategy(6,4));
    }
    @Test(expected = ArithmeticException.class)
    public void divideByzero(){
        StrategyPattern divide = new StrategyPattern(new DivisionOperation());
        divide.executeStrategy(6,0);
    }
}
