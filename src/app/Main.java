package app;

public class Main {

    private static final String CURRENCY = "EUR";
    static float priceUnit;//ціна за 1 одиницю товару
    static int countSales;//кількість продаж на день
    static int countDay;//кількість днів проведення торгівлі
    static float totalPrice;//загальна сума продажів
    static float dayPrice;//сума продажів за день
    static int totalSales;//загальна кількість проданого товару за період торгівлі
    static int numProduct;

    public static void main(String[] args) {

        //========== Product No 1 ==============
        //dayPrice = 2430.68f;//відомо за умовою
        //countDay = 5;//відомо за умовою
        numProduct = 1;
        priceUnit = 349.99f;
        countSales = (int)(Math.random()*5) + 3;//нехай буде випадковo від 3 до 8
        countDay = (int)(Math.random()*3) + 2;//до 5ти днів

        totalSales = countSales*countDay;//Розраховуємо кількість проданного товару за 1 день
        totalPrice = priceUnit*totalSales;//за період торгівлі
        dayPrice = totalPrice/countDay;//Середня сума продажів

        System.out.printf("%nProduct No %d: Smartphone, " +
                "%nTotal sales for %d days is %s %.2f %nSales by day is %s %.2f%n",
                numProduct,countDay,CURRENCY,totalPrice,CURRENCY,dayPrice);


        //============ Product No 2 ==============
        numProduct++;
        priceUnit = 1349.99f;
        countSales = (int)(Math.random()*5) + 5;//нехай буде випадковo від 5 до 10
        countDay = (int)(Math.random()*5) + 2;//до 7ми днів

        totalSales = countSales*countDay;//Розраховуємо кількість проданного товару за 1 день
        totalPrice = priceUnit*totalSales;//за період торгівлі
        dayPrice = totalPrice/countDay;//Середня сума продажів

        System.out.printf("%nProduct No %s: laptop, " +
                        "%nTotal sales for %d days is %s %.2f %nSales by day is %s %.2f%n",
                numProduct,countDay,CURRENCY,totalPrice,CURRENCY,dayPrice);




    }
}
