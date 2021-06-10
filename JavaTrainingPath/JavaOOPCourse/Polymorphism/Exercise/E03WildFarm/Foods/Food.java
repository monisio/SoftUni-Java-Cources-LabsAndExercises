package JavaOOPCourse.Polymorphism.Exercise.E03WildFarm.Foods;

public abstract class Food {
   protected Integer quantity;

   protected Food(Integer quantity){
      this.quantity=quantity;
   }

   public Integer getQuantity(){
      return this.quantity;
   }
}
