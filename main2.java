public static void main (String[] args) {
    point2 p1 = new point2(3, 4);
    point2 p2 = new point2(1, 2);
    point2 p3 = new point2(p1);

    p1.display();
    p2.display();
    p3.display();

    line2 l1 = new line2(1, 2, 3, 4);
    line2 l2 = new line2(l1);

    l1.display();
    l2.display();

    triangle2 t1 = new triangle2(3, 4, 5);
    triangle2 t2 = new triangle2(t1);
    t1.display();
    t2.display();

}