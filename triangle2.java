class triangle2
{
    private double sideA;
    private double sideB;
    private double sideC;

    // Null Cons
    public triangle2() {
        this.sideA = 0;
        this.sideB = 0;
        this.sideC = 0;

    }

    // Parameterized Cons
    public triangle2(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC; 

    }

    // Copy Cons
    public triangle2(triangle2 obj) {
        this.sideA = obj.sideA;
        this.sideB = obj.sideB;
        this.sideC = obj.sideC;
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

    // show
    void display() {
        System.out.println("Side A=" + this.sideA + " Side B=" + this.sideB + " Side C=" + this.sideC);

    }

    // toString
    public String toString() {
        return "Side A=" + this.sideA + " Side B=" + this.sideB + " Side C=" + this.sideC;
    }
}
   
   