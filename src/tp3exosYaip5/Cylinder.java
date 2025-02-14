package tp3exosYaip5;

class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        this.base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(base.getRadius(), 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base.toString() + ", height=" + height + "]";
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Volume: " + c1.getVolume());

        Cylinder c2 = new Cylinder(2.5, "blue", 5.0);
        System.out.println(c2);
        System.out.println("Volume: " + c2.getVolume());
    }
}

