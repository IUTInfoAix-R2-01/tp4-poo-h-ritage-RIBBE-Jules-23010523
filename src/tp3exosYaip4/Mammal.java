package tp3exosYaip4;

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }

    public static void main(String[] args) {
        Mammal m = new Mammal("Charlie");
        System.out.println(m);
    }
}