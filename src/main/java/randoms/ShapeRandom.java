package randoms;

import shape.*;
import java.util.*;

public class ShapeRandom implements IShapeRandom {
    /**
     * количество типов фигур в рандомк
     */
    private static final int SIZE = 4;

    private static final Random RANDOM = new Random();

    private static final Creator creator = new Creator();


    /**
     * минимальное количество фигур
     */
    static final int MIN_SHARE_RANDOM = 1;
    /**
     * максимальное количество фигур
     */
    static final int MAX_SHARE_RANDOM = 10;
    /**
     * минимальное количество длины стороны
     */
    static final int MIN_RANDOM_SIDE_LENGTH = 1;
    /**
     * максимальное количество длины стороны
     */
    static final int MAX_RANDOM_SIDE_LENGTH = 10;

    /**
     * метод  возвращает случайный цвет
     *
     * @return enum  цвета
     * @see IShapeRandom
     */
    @Override
    public EColor getColorRandomName() {
        return EColor.randomLetter();
    }


    /**
     * метод  возвращает случайное количество фигур в масиве
     *
     * @return int  фигур
     */
    @Override
    public int getNambertShareRandom() {
        return MIN_SHARE_RANDOM + (int) (Math.random() * MAX_SHARE_RANDOM);
    }

    /**
     * метод  возвращает случайную длинну фигуры
     *
     * @return double  длина стороны фигуры
     */
    @Override
    public double getRandom_Side_length() {
        return MIN_RANDOM_SIDE_LENGTH + (int) (Math.random() * MAX_RANDOM_SIDE_LENGTH);
    }

    /**
     * метод возвращает масив случайной длины с фигурами
     *
     * @return
     */
    public Shape[] getShape() {
        Shape[] arrshape = new Shape[this.getNambertShareRandom()];
        for (int i = 0; i < arrshape.length; i++) {

            int n = RANDOM.nextInt(SIZE);
            switch (n) {
                case 0:
                    arrshape[i] = creator.createCircle();
                    break;
                case 1:
                    arrshape[i] = creator.createRectangle();
                    break;
                case 2:
                    arrshape[i] = creator.createTrapezium();
                    break;
                case 3:
                    arrshape[i] = creator.createTriangle();
                    break;
            }
        }
        return arrshape;
    }

}