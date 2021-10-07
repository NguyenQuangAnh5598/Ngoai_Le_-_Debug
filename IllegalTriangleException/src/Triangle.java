public class Triangle {
    private double a, b, c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("edge can only be positive");
        }
        if (a >= b + c || b >= a + c || c >= a + b) {
            throw new IllegalTriangleException("This is not a side of triangle");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
