import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("매입가 입력 : ");

        int price = keyboard.nextInt();
        double profitRate = 0.3;
        double taxRate = 0.1;
        double sellingPrice = price * (1 + profitRate);
        double salesTax = sellingPrice * taxRate;
        double purchaseTax = price * taxRate;
        double paymentTax = salesTax - purchaseTax;



        System.out.println();
        System.out.println("정가 : " + (int)sellingPrice + "원");
        System.out.println("매출 세액 : " + (int)salesTax + "원");
        System.out.println("매입 세액 : " + (int)purchaseTax + "원");
        System.out.println("납부 세액 : " + (int)paymentTax + "원");


        keyboard.close();
    }
}
