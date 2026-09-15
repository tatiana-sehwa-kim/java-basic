package poly.ex3;

public class AnimalPolyMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        printAnimal(dog);
        printAnimal(cat);

    }

    public static void printAnimal(Animal animal) {
        System.out.println("울음소리 시작");
        animal.sound();
        System.out.println("울음소리 종료");
    }
}
