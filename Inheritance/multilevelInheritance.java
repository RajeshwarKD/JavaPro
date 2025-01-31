class Animal1 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog1 extends Dog1 {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class multilevelInheritance {
    public static void main(String[] args) {
        BabyDog1 bd = new BabyDog1();
        bd.eat();
        bd.bark();
        bd.weep();
    }
}
