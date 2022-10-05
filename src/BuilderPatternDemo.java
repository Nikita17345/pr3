public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal = mealBuilder.prepareNonVegMeal();

        meal.showItems();
        System.out.println("Total cost: " + meal.getCost());

    }
}