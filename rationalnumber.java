class RationalNumber {
    private int numerator;
    private int denominator;

    //null constructor
    public RationalNumber() {
        this.numerator = 0;
        this.denominator = 1;
    }

    //parameterized constructor
    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    //getter for numerator
    public int getNumerator() {
        return numerator;
    }
    
    //getter for denominator
    public int getDenominator() {
        return denominator;
    }

    //copy constructor
    public RationalNumber(RationalNumber other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    //gcd method to simplify the fraction
    private int gcd(int a, int b) {
        a=Math.abs(a);
        b=Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //setter for numerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    //setter for denominator
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
    }
    
    //add method
    public RationalNumber add(RationalNumber other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new RationalNumber(newNumerator, newDenominator);
    }

    //tostring method
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(1, 2);
        RationalNumber r2 = new RationalNumber(3, 4);
        RationalNumber sum = r1.add(r2);
        System.out.println("Sum: " + sum); 
    
    }
    
}
