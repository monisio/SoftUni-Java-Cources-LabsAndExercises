package JavaOOPCourse.Encapsulation.Excercise.ClassBox;

public class Box {


    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height) {
        setLength(length);
        setHeight(height);
        setWidth(width);

    }

    private void setLength(double length) {
        if(checkParametersData(length)){
            throwException("Length");
        }

        this.length = length;
    }

    private void setWidth(double width) {
        if(checkParametersData(width)){
            throwException("Width");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if(checkParametersData(height)){
            throwException("Height");
        }
        this.height = height;
    }

    private boolean checkParametersData(double data){
       return data<=0;
    }

    private void throwException(String parameterName){
        throw new IllegalArgumentException(parameterName+"cannot be zero or negative." );
    }

    public double calculateSurfaceArea() {
        return (2 * this.length * this.width) + (2 * this.length * this.height) + (2 * this.width * height);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * this.height * (this.length + this.width);
    }

    public double calculateVolume() {
        return length * height * width;
    }

}
