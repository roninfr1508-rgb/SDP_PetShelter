public class VetCheckupVisitor implements AnimalVisitor {
    @Override
    public void visitDog(Dog dog) {
        System.out.print(" VET [dog " + dog.getName() + "]: ");
        if (dog.getAgeYears() > 7) {
            System.out.println("Old dog (" + dog.getAgeYears() + " age). An examination of the joints has been scheduled, and vitamins have been prescribed.");
        } else {
            System.out.println("Young dog. Standard annual vaccination.");
        }
    }

    @Override
    public void visitCat(Cat cat) {
        System.out.print(" Vet [cat " + cat.getName() + "]: ");
        if (cat.isLongHaired()) {
            System.out.println("Long-haired. Requires checks for mats and a hairball-remedy paste.");
        } else {
            System.out.println("Shorthaired. Ear cleaning and a standard examination.");
        }
    }
}
