package Factory_Method;

public class Main {
    public static void main(String[] args) {
        Animal a1 = Animal.createAnimal("dog");
        System.out.println(a1.getName());
        Animal a2 = Animal.createAnimal("cat");
        System.out.println(a2.getName());
    }
}
