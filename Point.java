public class Point {

    private int x;
    private int y;
    static int objCount;

    // 1) Null
    public Point() {
        this.x = 0;
        this.y = 0;
        objCount++;
    }

    // 2) Parameterized Cons
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        objCount++;
    }

    // 3) Copy Cons
    public Point(Point obj) {
        this.x = obj.x;
        this.y = obj.y;
        objCount++;
    }

    // Getters
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // show.
    void display() {            
        System.out.println("x = " + this.x + " y = " + this.y);
        System.out.println("Object Count: " + objCount);
    }

    // toString
    public String toString() {      
        return "x = " + this.x + " y = " + this.y;
    }

    // Add Meth
    public Point add(Point obj) {
        int nx = this.x + obj.x;
        int ny = this.y + obj.y;
        Point n = new Point(nx, ny);
        return n;
    }

    // Subtract Meth
    public Point sub(Point obj) {
        int nx = this.x - obj.x;
        int ny = this.y - obj.y;
        Point n = new Point(nx, ny);
        return n;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.display();

        Point p2 = new Point(2,5);
        p2.display();

        Point p3 = new Point(p2);
        p3.display();

        Point p4 = p3.add(p3);
        p4.display();
        
        Point p5 = p3.sub(p3);
        p5.display();
    }
}