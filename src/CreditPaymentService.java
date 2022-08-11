public class CreditPaymentService {
    public double calculate(double credit, double percent, double period, double amount){
        double monthpercent = percent / period;
        double payment = amount * monthpercent / (1 - ( 1 / Math.pow (( 1 + monthpercent), period)));
        return payment;
    }
}
