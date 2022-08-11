public class Main {
    public static void main(String[] args) {
        double amount = 1_000_000; // сумма кредита
        double percent = 9.99; // процентная ставка
        double period = 12; // срок
        double monthpercent = percent / period; // ежемесячная процентная ставка
        double payment = amount * monthpercent / (1 - ( 1 / Math.pow (( 1 + monthpercent), period)));
        System.out.println(payment);
    }
}
