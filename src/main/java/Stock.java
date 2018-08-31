import java.text.DecimalFormat;

public class Stock {

    String symbol;

    String name;

    double previousClosingPrice;

    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;

    }

    public  double getChangePercent(){
        double percentChanged = (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice * 100;
        DecimalFormat decimalFormat = new DecimalFormat(".##");
        return Double.valueOf(decimalFormat.format(percentChanged));
    }
}
