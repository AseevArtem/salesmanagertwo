public class SalesManager {
    protected int[] sales;
    protected int sredsum;
    protected int sred;


    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }


    public int avg() {
        int MinSales = sales[0];
        int MaxSales = -1;

        for (int sale : sales) {
            if (sale > MaxSales) {
                MaxSales = sale;
            }
        }

        for (int sale : sales) {
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

