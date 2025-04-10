public class Sphere extends ThreeDimensionalShape{
    public Sphere(float x, float y, float z) {
        super(x, y, z);
    }

    @Override
    public float getVolume() {
        return (float) ((4.0 / 3) * Math.PI * Math.pow((getX()/2),3));
    }

    @Override
    public float getArea() {
        return (float) (4 * Math.PI * Math.pow((getX()/2),2));
    }
}
