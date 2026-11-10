import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void accept(AnimalVisitor visitor) {
        for (Animal animal : animals) {
            animal.accept(visitor);
        }
    }
}
