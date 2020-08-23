public class Denumerator {
    public double denumerator(double creditTermMonths){
        double powValue = creditTermMonths * -1;
        double degreePart;
        degreePart = 1+(9.99/(12*100));
        double degreeGet = Math.pow(degreePart, powValue);
        double denumer = 1 - degreeGet;
        return denumer;
    }
}
