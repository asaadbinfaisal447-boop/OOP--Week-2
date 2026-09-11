public class line2 {

    private point2 start;
    private point2 end;

    //null
    public line2() {
        this.start = new point2();
        this.end = new point2();
    }
    //parameterized
    public line2(int x1, int y1, int x2, int y2 ) {
        this.start = new point2(x1, y1);
        this.end = new point2(x2, y2);
    }
    //copy
    public line2(line2 obj) {
        this.start = new point2(obj.start);
        this.end = new point2(obj.end);
    }
    //show
    public void display() {
        System.out.println("Start Point: " + this.start);
        System.out.println("End Point: " + this.end);
    }
    //toString
    public String toString() {
        return "Start Point: " + this.start + ", End Point: " + this.end;
    }
    //setters
    public void setStart(point2 start) {
        this.start = start;
    }

    public void setEnd(point2 end) {
        this.end = end;
    }
    //getters
    public point2 getStart() { 
        return this.start;
    } 

    public point2 getEnd() {
        return this.end;
    }
}