package JavaOOPCourse.WorkingWithAbstraction.E04HotelReservation;

public  class PriceCalculator {

    public static double calculate(double pricePerDay,int numberOfDays,Seasons season,DiscountType discount ){

        return   (pricePerDay * numberOfDays * season.getFactor()) * (discount.getDiscount());


    }
}
