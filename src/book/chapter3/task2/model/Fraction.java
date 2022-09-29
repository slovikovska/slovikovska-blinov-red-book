package book.chapter3.task2.model;

public class Fraction {
    private double numeratorM;
    private double denominatorN;


    public Fraction (double numeratorM, double denominatorN) {
        this.numeratorM = numeratorM;
        this.denominatorN = denominatorN;
    }

    public double getNumerator() { return numeratorM; }
    public void setNumerator( int numerator ) { this.numeratorM = numerator; }

    public double getDenominator() { return denominatorN; }
    public void setDenominator( int denominator) { this.denominatorN = denominator; }

    public String toString() {
        StringBuilder intList = new StringBuilder();
        intList.append(this.numeratorM);
        intList.append(this.denominatorN);
        return intList.toString();
    }
}
