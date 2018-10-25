package shape;

/**
 * абстрактная клас  для описания абстрактоной фигуры с имплементированым методом  IDraw
 * @see shape.IDraw
 */
public abstract class Shape implements IDraw {
    /**
     * цвет фигуры
     */
    private String shapeColor;

    /**
     * конструктор  принимает  String  цвета
     * @param shapeColor
     */
    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    /**
     *  площадь
     * @return double площади
     */
    public abstract double calcArea();


    public String getShapeColor() {
        return shapeColor;
    }


    @Override
    public String toString() {
        return "shapeColor=" + shapeColor;
    }


}
