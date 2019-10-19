public abstract class Animal {

    private int id;
    private int age;
    private int weight;
    private String color;
    private String name = "Нет имени";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String voiceCast(Animal animal) {

        String words = "Hello, ";
        if (animal instanceof Pet) {
            words = words.concat("my name is " + animal.name);
        }
        if (animal instanceof Wild) {
            words = words.concat("I am a wild animal");
        }
        if (animal instanceof Predator) {
            words = words.concat(" and I am hungry");
        }
        if (animal instanceof Dog) {
            words = words.concat(" Woof");
        }
        if (animal instanceof Cat) {
            words = words.concat(" Meow");
        }
        if (animal instanceof GuideDog) {
            words = words.concat(" I can take you home");
        }
        if (animal instanceof Fish) {
            words = "...";
        }
        System.out.println(words);
        return words;
    }

}
