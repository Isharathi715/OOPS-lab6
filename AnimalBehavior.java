public class AnimalBehavior {
    public static void main(String[] args) {
        Animal[] animals = { new Lion(), new Tiger(), new Deer() };
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
    }
}
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}
class Lion extends Animal {
    void eat() { System.out.println("Lion eats meat."); }
    void sleep() { System.out.println("Lion sleeps in its den."); }
}
class Tiger extends Animal {
    void eat() { System.out.println("Tiger eats meat."); }
    void sleep() { System.out.println("Tiger sleeps in a sheltered area."); }
}
class Deer extends Animal {
    void eat() { System.out.println("Deer eats grass and leaves."); }
    void sleep() { System.out.println("Deer sleeps in a safe forest area."); }
}
