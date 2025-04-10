public abstract class Shape {
    private float x;
    private float y;
    public abstract float getArea();

    public Shape(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Shape() {
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
}
