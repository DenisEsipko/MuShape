package randoms;

import shape.Shape;

/**
 *
 *интрефес  для гененирующих случайных значений
 */

public interface IShapeRandom {

    /**
     * метод  возвращает случайный цвет
     * @return значени enum  цвета
     */
    EColor getColorRandomName();


    /**
     * метод  возвращает  количество случайных количество фигур для длинный масива
     * @return  int   фигур
     */
    int getNambertShareRandom();


    /**
     * метод  возвращает случайную длинну ребра фигуры
     * @return double  длина стороны
     */
    double getRandom_Side_length();


    /**
     * метод  возвращает масив  фигур случайной длины
     * @return Shape []
     */
    Shape [] getShape();
}
