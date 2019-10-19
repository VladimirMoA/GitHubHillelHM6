public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[9];
        animals[0] = new Cat("Боря");
        animals[1] = new Crocodile();
        animals[2] = new Dog("Рекс");
        animals[3] = new Fish("Золотой");
        animals[4] = new Giraffe();
        animals[5] = new GuideDog("Помощник");
        animals[6] = new Hamster("Хома");
        animals[7] = new Lion();
        animals[8] = new Wolf();

        for (int i = 0; i < animals.length; i++) {
            animals[i].voiceCast(animals[i]);
        }

    }

}
