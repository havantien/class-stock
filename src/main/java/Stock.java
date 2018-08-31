import java.text.DecimalFormat;

public class Stock {
    // Trường dữ liệu thuộc kiểu String là symbol lưu mã cổ phiếu symbol
    String symbol;

    // Trường name có kiểu dữ liệu là String lưu tên cô phiếu
    String name;

    //Trường dữ liệu previousClosingPrice có kiểu dữ liệu double lưu giá cổ phiếu của ngày trước đó
    double previousClosingPrice;

    //Trường dữ liệu currentPrice có kiểu dữ liệu double lưu giá cổ phiếu hiện tại
    double currentPrice;

    //Constructor để tạo đối tượngn cổ phiếu với symbol và name cho trước
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    //Phương thức getChangePercent() trả về tỉ lệ phần trăm thay đổi từ previousClosingPrice đến currentPrice.
    public  double getChangePercent(){
        double percentChanged = (this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice * 100;
        DecimalFormat decimalFormat = new DecimalFormat(".##");
        return Double.valueOf(decimalFormat.format(percentChanged));
    }
}
