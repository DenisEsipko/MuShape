package randoms;

import java.util.*;
import java.util.*;
/**
 *в enum  даны цвеат фигур
 *    метод  randomLetter()  возвращает случайный цвет
 */

public enum EColor {
    RED,
    GRIN,
    PINK;

    private static final List<EColor> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    /**
     * метод  возвращает случайный цвет
     * @return EColor
     */
    public static EColor randomLetter()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}
