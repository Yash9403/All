public class AmazonPay implements A{
    @Override
    public String doPayment(String amount, String password) {
        String txnDate = A.datePattern("yyyy-mm-dd");
        return null;
    }

    @Override
    public double getSratchCard() {
        return A.super.getSratchCard();
    }
}
