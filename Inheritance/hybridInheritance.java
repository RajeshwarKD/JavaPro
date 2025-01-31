interface Animal4 {
    void eat();
}

interface WildAnimal4 extends Animal4 {
    void hunt();
}

interface Pet4 extends Animal4 {
    void play();
}

class Dog4 implements Pet4, WildAnimal4 {
    public void eat() {
        System.out.println("Eating...");
    }
    public void hunt() {
        System.out.println("Hunting...");
    }
    public void play() {
        System.out.println("Playing...");
    }
}

public class hybridInheritance {
    public static void main(String[] args) {
        Dog4 d = new Dog4();
        d.eat();
        d.play();
        d.hunt();
    }
}
