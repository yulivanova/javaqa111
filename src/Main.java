public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int paymentYear = (int) service.calculate(1_000_000, 9.99, 1);
        System.out.println("Ежемесячный платёж " + paymentYear + " рублей");

        int paymentTwoYears = (int) service.calculate(1_000_000, 9.99, 2);
        System.out.println("Ежемесячный платёж " + paymentTwoYears + " рублей");

        int paymentThreeYears = (int) service.calculate(1_000_000, 9.99, 3);
        System.out.println("Ежемесячный платёж " + paymentThreeYears + " рублей");
    }
}
