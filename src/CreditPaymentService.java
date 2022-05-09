public class CreditPaymentService {
    public double monthlyPayment(int years, int amount, double percent) {

        int month = years * 12; //12
        int degree = -month;
        int remains = amount;   //1_000_000
        double rateMonth = percent / (100 * 12); //9.99 / (1200) = 0.008325
        double y = (1 + rateMonth);
        double x = 1 - Math.pow(y, degree);

        double payMonth = remains * ((rateMonth) / (x));

        return payMonth;
    }

}
