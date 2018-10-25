package shape;

import java.util.*;

/**
 * трехугольник implements IDraw, IGiponenuse
 */

public class Triangle extends Shape implements IDraw, IGiponenuse {

    /**
     * стороны  трехугольника
     */
    private double cathetus1, cathetus2;


    public Triangle(String shapeColor, double cathetus1, double cathetus2) {
        super(shapeColor);
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;

    }

    @Override
    public double calcArea() {
        double p = (cathetus1 + cathetus2 + returnGiponenuse()) / 2;
        return Math.sqrt( p*((p-cathetus1)*(p-cathetus2)*(p-returnGiponenuse()))   );
    }

    @Override
    public double returnGiponenuse() {
        return  Math.sqrt(Math.pow(cathetus1,2)+Math.pow(cathetus2,2));
    }

    @Override
    public void drav() {
        System.out.println(toString() + "    Площадь фигуры= " + calcArea());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" cathetus1=");
        sb.append(cathetus1);
        sb.append(", cathetus2=");
        sb.append(cathetus1);
        sb.append(", giponenuse=");
        sb.append(returnGiponenuse());
        sb.append(", ");
        sb.append(super.toString());
        return sb.toString();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        if (Double.compare(triangle.getCathetus1(), getCathetus1()) != 0) return false;
        return Double.compare(triangle.getCathetus2(), getCathetus2()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getCathetus1());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCathetus2());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    // Get  Set


    public double getCathetus1() {
        return cathetus1;
    }

    public void setCathetus1(double cathetus1) {
        this.cathetus1 = cathetus1;
    }

    public double getCathetus2() {
        return cathetus2;
    }

    public void setCathetus2(double cathetus2) {
        this.cathetus2 = cathetus2;
    }

}