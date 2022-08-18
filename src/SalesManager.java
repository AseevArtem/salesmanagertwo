public class SalesManager {

    protected long sredsum;
    protected long sred;
    protected long[] sales;


    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }


    public long avg() {
        long MinSales = sales[0];
        long MaxSales = -1;

        for (long sale : sales) {
            if (sale > MaxSales) {
                MaxSales = sale;
            }
        }

        for (long sale : sales) {
            if (sale < MinSales) {
                MinSales = sale;
            }
        }

        for (int j = 0; j < sales.length; j++) {
            if (sales[j] != MaxSales) {
                if (sales[j] != MinSales) {
                    sredsum += sales[j];
                }
            }
        }
        sred = sredsum / (sales.length - 2);


        return sred;
    }

}

