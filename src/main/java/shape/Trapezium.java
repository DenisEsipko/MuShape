package shape;

/**
 *  слас для трапеции implements IDraw
 */
public class Trapezium extends Shape implements IDraw {
    /**
     * стороны трапеции
     */
    private double dn_width, up_width, height;

    public Trapezium(String shapeColor, double dn_width, double up_width, double height) {
        super(shapeColor);
        this.dn_width = dn_width;
        this.up_width = up_width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return 0.5*(dn_width+up_width)*height;
    }

    @Override
    public void drav() {
        System.out.println(toString() +"    Площадь фигуры= "+calcArea());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" dn_width=");
        sb.append(dn_width);
        sb.append(", up_width=");
        sb.append(up_width);
        sb.append(", height=");
        sb.append(height);
        sb.append(", ");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trapezium)) return false;

        Trapezium trapezium = (Trapezium) o;

        if (Double.compare(trapezium.getDn_width(), getDn_width()) != 0) return false;
        if (Double.compare(trapezium.getUp_width(), getUp_width()) != 0) return false;
        return Double.compare(trapezium.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getDn_width());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getUp_width());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    // Get Set

    public double getDn_width() {
        return dn_width;
    }

    public void setDn_width(double dn_width) {
        this.dn_width = dn_width;
    }

    public double getUp_width() {
        return up_width;
    }

    public void setUp_width(double up_width) {
        this.up_width = up_width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
