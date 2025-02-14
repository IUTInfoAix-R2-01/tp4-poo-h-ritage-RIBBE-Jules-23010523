package tp3exosYaip4;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }

    public static void main(String[] args) {
        Person p = new Person("John Doe", "123 Main St");
        System.out.println(p);
        p.setAddress("456 Elm St");
        System.out.println("Updated address: " + p);
    }
}