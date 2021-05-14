package JavaOOPCourse.WorkingWithAbstraction.E02PointsInRectangle;

public class Point implements Comparable<Point> {

    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public int compareTo(Point other) {
        int result = this.x - other.x;
        return result != 0 ? result : this.y - other.y ;
    }

}
