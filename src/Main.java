public class Main {
    public static void main(String[] args) {

        Calculate service = new Calculate();

        double monthlyPayment1year = service.calculate(1_000_000, 12);
        System.out.println((int) monthlyPayment1year);

        double monthlyPayment2years = service.calculate(1_000_000, 24);
        System.out.println((int) monthlyPayment2years);

        double monthlyPayment3years = service.calculate(1_000_000, 36);
        System.out.println((int) monthlyPayment3years);
    }
}