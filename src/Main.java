public class Main {
    public static void main(String[] args) {

        SalesManager SalesManager = new SalesManager(new int[]{2, 3, 3, 14, 10});

        System.out.println(SalesManager.max());
        System.out.println(SalesManager.avg());
    }
}
