package shape;

import java.util.*;

/**
 * класс прямоугольника implements IDraw
 */

public class Rectangle extends Shape implements IDraw {
    /**
     * стороны  тпрямоугольника
     */
    private double width, height;


    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public  double calcArea() {
        return width * height;
    }

    @Override
    public void drav() {
        System.out.println(toString()+"    Площадь фигуры= "+calcArea());
    }


    @Override
    public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append(" width=");
            sb.append(width);
            sb.append(", height=");
            sb.append(height);
            sb.append(", ");
            sb.append(super.toString());
            return sb.toString();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.getWidth(), getWidth()) != 0) return false;
        return Double.compare(rectangle.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getWidth());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


// Get Set

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
