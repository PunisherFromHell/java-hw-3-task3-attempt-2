public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthPay = service.calculate(1_000_000, 9.99, 12);

        System.out.println(monthPay);
        int monthPay1 = service.calculate(1_000_000, 9.99, 24);
        System.out.println(monthPay1);
        int monthPay2 = service.calculate(1_000_000, 9.99, 36);
        System.out.println(monthPay2);

    }
}