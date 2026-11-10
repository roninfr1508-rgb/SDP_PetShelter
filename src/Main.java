public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Dog("Rex", 25.0, 8));
        zoo.addAnimal(new Cat("Puss in Boots", 4.5, true));
        zoo.addAnimal(new Dog("Toto", 12.0, 3));
        zoo.addAnimal(new Cat("Garfield", 3.8, false));

        System.out.println("=== 1. CALCULATION OF THE DAILY FEED ALLOWANCE===");
        DailyFoodVisitor foodVisitor = new DailyFoodVisitor();
        zoo.accept(foodVisitor);
        System.out.println("Total amount of food for the entire shelter: " + foodVisitor.getTotalFoodGrams() + " gram.\n");

        System.out.println("=== 2. VET INSPECTION ===");
        VetCheckupVisitor vetVisitor = new VetCheckupVisitor();
        zoo.accept(vetVisitor);
    }
}
