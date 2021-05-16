package JavaOOPCourse.WorkingWithAbstraction.E04HotelReservation;

public enum DiscountType {
        VIP(0.8),
        SECOND_VISIT(0.9),
        NONE(1);

        double discount;

        DiscountType(double discount){
            this.discount=discount;
        }

       public double getDiscount(){
            return this.discount;
       }


}
