package JavaOOPCourse.WorkingWithAbstraction.E04HotelReservation;

public enum Seasons {

    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    int factor;

    Seasons(int factor) {
        this.factor = factor;
    }

    public int getFactor() {
        return this.factor;
    }


}
