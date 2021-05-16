package JavaOOPCourse.WorkingWithAbstraction.E02PointsInRectangle;

public class Rectangle {

    private Point bottomLeft;
    private Point topRight;


    public Rectangle(Point bottomLeft, Point upperRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = upperRight;
    }

    public boolean contain(Point other) {

      return compareWithLeft(other)&&compareWithRight(other);


    }

    private boolean compareWithRight(Point other) {
        int resultX = this.topRight.compareX(other.getX());
        int resultY = this.topRight.compareY(other.getY());

        if (resultX>=0 && resultY>=0){
            return true;
        }

        return false;
    }

    private boolean compareWithLeft(Point other) {
        int resultX = this.bottomLeft.compareX(other.getX());
        int resultY = this.bottomLeft.compareY(other.getY());

        if (resultX<=0 && resultY<=0){
            return true;
        }

        return false;
    }


}
