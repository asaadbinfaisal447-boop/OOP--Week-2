class Triangle 
{
    private double sideA;
    private double sideB;
    private double sideC;
    static int objCount;

    // Null Cons
    public Triangle() {
        this.sideA = 0;
        this.sideB = 0;
        this.sideC = 0;
        objCount++;
    }

    // Parameterized Cons
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC; 
        objCount++;
    }

    // Copy Cons
    public Triangle(Triangle obj) {
        this.sideA = obj.sideA;
        this.sideB = obj.sideB;
        this.sideC = obj.sideC;
        objCount++;
    }

    // Setter
    public void set(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Getters
    public double getA() { 
        return this.sideA;
    }

    public double getB() { 
        return this.sideB;
    }

    public double getC() { 
        return this.sideC;
    }

    // Add Meth
    public Triangle add(Triangle t) {
        Triangle result = new Triangle();
        result.sideA = this.sideA + t.sideA;
        result.sideB = this.sideB + t.sideB;
        result.sideC = this.sideC + t.sideC;
        return result;
    }

    // Subtract Meth
    public Triangle subtract(Triangle t) {
        Triangle result = new Triangle();
        result.sideA = this.sideA - t.sideA;
        result.sideB = this.sideB - t.sideB;
        result.sideC = this.sideC - t.sideC;
        return result;
    }

    // show
    void display() {
        System.out.println("Side A=" + this.sideA + " Side B=" + this.sideB + " Side C=" + this.sideC);
        System.out.println("Object Count: " + objCount);
    }

    // toString Meth
    @Override
    public String toString() {
        return "Side A=" + this.sideA + " Side B=" + this.sideB + " Side C=" + this.sideC;
    }

    public static void isRightAngle(double sideA, double sideB, double sideC) {
        double a2 = sideA * sideA;
        double b2 = sideB * sideB;
        double c2 = sideC * sideC;

        if ((a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2)) {
            System.out.println("It's a right angle triangle");
        } else {
            System.out.println("It's not a right angle triangle");
        }
    }

    // Main Meth
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.display();

        Triangle t2 = new Triangle(3.0, 4.0, 5.0);
        t2.display();
        Triangle.isRightAngle(3.0, 4.0, 5.0);

        Triangle t3 = new Triangle(t2);
        t3.display();

        // Testing add and subtract methods
        Triangle t4 = new Triangle(1.0, 2.0, 3.0);
        Triangle tSum = t2.add(t4);
        System.out.println("\nAfter Addition (t2 + t4):");
        tSum.display();

        Triangle tDiff = t2.subtract(t4);
        System.out.println("\nAfter Subtraction (t2 - t4):");
        tDiff.display();
    }
}