package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()};     // 변수합치기: Ctrl Alt N

        for (Animal animal : animalArr) {
            soundAnimal(animal);                //반복된 부분 메서드로 뽑기: Ctrl Alt M
        }
    }

    // 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
