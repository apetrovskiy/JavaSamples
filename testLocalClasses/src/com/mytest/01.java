abstract class Point {
    //public Point(){}
//
    //public Point(int x, int y) {
    //    this.x = x;
    //    this.y = y;
    //}

    int x = 1, y = 1;
    void move(int dx, int dy) {
        x += dx;
        y += dy;
        alert();
    }
    abstract void alert();
}
abstract class ColoredPoint extends Point {
    int color;
}
class SimplePoint extends Point {
    void alert() { }
}