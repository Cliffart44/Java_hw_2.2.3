public class MonthlyPayment {
    public double calculate(double creditAmount, double creditTermMonths){
        Numerator service = new Numerator();
        Denumerator service2 = new Denumerator();
        double numer = service.numerator(creditAmount);
        double denumer = service2.denumerator(creditTermMonths);
        double monthlyPayment = numer / denumer;
        return monthlyPayment;
    }
}
