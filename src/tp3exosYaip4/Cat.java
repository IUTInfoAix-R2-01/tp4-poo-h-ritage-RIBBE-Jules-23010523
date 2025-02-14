package tp3exosYaip4;

class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }

    public static void main(String[] args) {
        Cat c = new Cat("Whiskers");
        System.out.println(c);
        c.greets();
    }
}