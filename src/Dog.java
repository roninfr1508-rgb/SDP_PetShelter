public class Dog implements Animal {
    private final String name;
    private final double weightKg;
    private final int ageYears;

    public Dog(String name, double weightKg, int ageYears) {
        this.name = name;
        this.weightKg = weightKg;
        this.ageYears = ageYears;
    }

    public String getName() {
        return name;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public int getAgeYears() {
        return ageYears;
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitDog(this);
    }

}
