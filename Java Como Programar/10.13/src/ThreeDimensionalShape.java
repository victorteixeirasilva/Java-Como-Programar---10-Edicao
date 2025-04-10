public abstract class ThreeDimensionalShape extends Shape{

    private float z;

    public ThreeDimensionalShape(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public abstract float getVolume();

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
}
