package JavaOOPCourse.WorkingWithAbstraction.E02PointsInRectangle;

public class Rectangle {

    private Point bottomLeft;
    private Point topRight;


    public Rectangle(Point bottomLeft, Point upperRight){
        this.bottomLeft= bottomLeft;
        this.topRight = upperRight;
    }

    public boolean contains(Point point){
       return this.bottomLeft.compareTo(point)<=0 && this.topRight.compareTo(point)>=0;
    }


}
