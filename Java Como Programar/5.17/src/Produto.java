public class Produto {

    private int id;
    private double value;

    public Produto(int id, double value) {
        this.id = id;
        this.value = value;
    }

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
