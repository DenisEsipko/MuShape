package randoms;

import shape.Shape;

/**
 *  создания фигур
 */
public interface ICreator {
    Shape createCircle();
    Shape createRectangle();
    Shape createTrapezium ();
    Shape createTriangle ();
}
