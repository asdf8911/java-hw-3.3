public class Main {
    public static void main(String[] args) {
        CreditPaymentService cps = new CreditPaymentService();

        double p = cps.monthlyPayment(1, 1_000_000, 9.99); //при years 2, p = 46140, при years 3, p = 32262
        System.out.println(Math.round(p));
    }

}

