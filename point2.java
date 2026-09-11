public class point2{

    private int x;
    private int y;

    //null
    public point2(){
        this.x = 0;
        this.y = 0;
        
    }

    //p
    public point2(int x, int y){
        this.x = x;
        this.y = y;
    }
    //copy
    public point2(point2 obj){
    this.x = obj.x;
    this.y = obj.y;
    }
//get
public int getx(){
    return this.x;
}
public int gety(){
    return this.y;
}
//setter
public void setx(int x){
    this.x = x;
}
public void sety(int y){
    this.y = y;
}

//show
void display(){

    System.out.println("x = " + this.x + " y = " + this.y);
}

//toString
public String toString(){
    return "x = " + this.x + " y = " + this.y;
}

}   