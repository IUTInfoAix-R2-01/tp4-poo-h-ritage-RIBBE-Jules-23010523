package tp3exosYaip4;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(3.5f, 7.5f);

        System.out.println(p1);
        System.out.println(p2);

        p1.setXY(1.5f, 2.5f);
        System.out.println("Updated p1: " + p1);

        float[] coordinates = p2.getXY();
        System.out.println("Coordinates of p2: x=" + coordinates[0] + ", y=" + coordinates[1]);
    }
}