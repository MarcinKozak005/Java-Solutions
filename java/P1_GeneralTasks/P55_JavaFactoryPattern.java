public class P55_JavaFactoryPattern {
    class FoodFactory {
        public Food getFood(String order) {
            if (order.equals("cake")) return new Cake();
            else return new Pizza();
        }

    }
}
