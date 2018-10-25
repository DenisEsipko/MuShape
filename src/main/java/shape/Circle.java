package shape;

import java.util.*;

/**
 * класс шара с имплементироваными методми IDraw, IDiameter
 */

public class Circle extends Shape implements IDraw, IDiameter {

    /**
     * радиус круга
     */
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void drav() {
        System.out.println(toString() + "    Площадь фигуры= " + calcArea());
    }


    @Override
    public double returnDiameter() {
        return radius * 2;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(" radius=");
        sb.append(radius);
        sb.append(", diameter=");
        sb.append(returnDiameter());
        sb.append(", ");
        sb.append(super.toString());
        return sb.toString();

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getRadius());
        return (int) (temp ^ (temp >>> 32));
    }

    // Get Set
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}