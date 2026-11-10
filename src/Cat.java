public class Cat implements Animal {
    private final String name;
    private final double weightKg;
    private final boolean isLongHaired;

    public Cat(String name, double weightKg, boolean isLongHaired) {
        this.name = name;
        this.weightKg = weightKg;
        this.isLongHaired = isLongHaired;
    }

    public String getName() {
        return name;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public boolean isLongHaired() {
        return isLongHaired;
    }

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visitCat(this);
    }
}
