public class GuideDog extends Animal implements Pet {

    public GuideDog(String name) {
        setName(name);
    }

    boolean isTrained = true;

    public void getMasterHome() {
        System.out.println("Поведу своего хозяина домой");
    }

}
