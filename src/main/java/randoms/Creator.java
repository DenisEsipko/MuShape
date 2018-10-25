package randoms;

import shape.*;

/**
 *   класс для создание фигур implements  ICreator
 * @see ICreator
 */
public  class Creator implements ICreator {
    /**
     * рандомизатор
     * @see ShapeRandom
     */
    private static final IShapeRandom shapeRandom = new ShapeRandom();

    /**
     *  создаем фигуры
     */
    @Override
    public  Shape createCircle() {
        return new Circle(shapeRandom.getColorRandomName().toString(), shapeRandom.getRandom_Side_length());
    }

    @Override
    public Shape createRectangle() {
        return new Rectangle(shapeRandom.getColorRandomName().toString(),
                shapeRandom.getRandom_Side_length(),
                shapeRandom.getRandom_Side_length());
    }

    @Override
    public Shape createTrapezium() {
        return new Trapezium(shapeRandom.getColorRandomName().toString(),
                shapeRandom.getRandom_Side_length(),
                shapeRandom.getRandom_Side_length(),
                shapeRandom.getRandom_Side_length());
    }

    @Override
    public Shape createTriangle() {
        return new Triangle(shapeRandom.getColorRandomName().toString(),
                shapeRandom.getRandom_Side_length(),
                shapeRandom.getRandom_Side_length());
    }
}
