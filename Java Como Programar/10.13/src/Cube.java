public class Cube extends ThreeDimensionalShape{
    public Cube(float x, float y, float z) {
        super(x, y, z);
    }

    @Override
    public float getVolume() {
        return (float) Math.pow(getX(), 2);
    }

    @Override
    public float getArea() {
        return (float) (6 * Math.pow(getX(), 2));
    }
}
