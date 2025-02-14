package tp3exosYaip4;

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Rex");
        Dog d2 = new Dog("Max");

        System.out.println(d1);
        System.out.println(d2);
        d1.greets();
        d2.greets(d2);
    }
}