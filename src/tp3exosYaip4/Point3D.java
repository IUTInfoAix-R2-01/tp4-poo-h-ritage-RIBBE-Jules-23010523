package tp3exosYaip4;

class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }

    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        Point3D p4 = new Point3D(1.0f, 2.0f, 3.0f);

        System.out.println(p3);
        System.out.println(p4);

        p3.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("Updated p3: " + p3);

        float[] coordinates3D = p4.getXYZ();
        System.out.println("Coordinates of p4: x=" + coordinates3D[0] + ", y=" + coordinates3D[1] + ", z=" + coordinates3D[2]);
    }
}
