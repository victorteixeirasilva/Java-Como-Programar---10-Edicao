public class Tetrahedron extends ThreeDimensionalShape{

    private float areaBase;
    private float areaFaceLateral;

    public Tetrahedron(float x, float y, float z) {
        super(x, y, z);
    }

    @Override
    public float getVolume() {
        getArea();
        return (float) ((1.0 / 3) * areaBase * getY());
    }

    @Override
    public float getArea() {
        this.areaBase = (float) Math.pow(getX(), 2);
         this.areaFaceLateral = (float) 4 * ((getX()*getZ()) / 2);
        return areaBase + areaFaceLateral;
    }
}
