interface Animal3 {
    void eat();
}

interface Pet3 {
    void play();
}

class Dog3 implements Animal3, Pet3 {
    public void eat() {
        System.out.println("Eating...");
    }

    public void play() {
        System.out.println("Playing...");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.eat();
        d.play();
    }
}
