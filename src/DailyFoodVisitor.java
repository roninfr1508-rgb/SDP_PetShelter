public class DailyFoodVisitor implements AnimalVisitor {
    private double totalFoodGrams = 0;

    @Override
    public void visitDog(Dog dog) {
        double food = dog.getWeightKg() * 40;
        totalFoodGrams += food;
        System.out.println(" Dog " + dog.getName() + " (" + dog.getWeightKg() + " kg): need " + food + "g pet food.");
    }

    @Override
    public void visitCat(Cat cat) {
        double food = cat.getWeightKg() * 30;
        totalFoodGrams += food;
        System.out.println(" Cat " + cat.getName() + " (" + cat.getWeightKg() + " kg): need " + food + "g pet food.");
    }

    public double getTotalFoodGrams() {
        return totalFoodGrams;
    }
}
