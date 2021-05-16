package JavaOOPCourse.WorkingWithAbstraction.E02PointsInRectangle;

public class Point  {
    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }



    public int compareX(int x){

        return  this.x - x;

    }

    public int compareY(int y){
        return this.y - y;
    }

}
