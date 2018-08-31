import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StockTest {
    @Test
    public void testThatDisplayPercentChanged() {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        double expect = -0.43;
        double actual = stock.getChangePercent();
        assertEquals(expect, actual);

    }
}
