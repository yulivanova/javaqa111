public class CreditPaymentService {
    public double calculate(int creditAmount, double interestRate, int numberOfMonths) {
        int months = numberOfMonths * 12;
        double monthlyInterestRate = interestRate / 1200;
        double payment = creditAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -months));
        return payment;
    }
}
