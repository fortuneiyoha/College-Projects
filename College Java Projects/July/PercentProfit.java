public class PercentProfit {
    public static void main(String[] args) {
        double costPrice, sellingPrice, profit, percentProfit;

        costPrice = 200000;
        sellingPrice = 225000;

        profit = sellingPrice - costPrice;
        percentProfit = (profit / costPrice) * 100;

        System.out.println(percentProfit);
    }
}

user @DESKTOP-MINGW64~/Desktop/Projects/

Java Projects
$ java PercentProfit.java
12.5
