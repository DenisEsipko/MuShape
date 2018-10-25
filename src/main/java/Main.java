import randoms.ShapeRandom;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {

        ShapeRandom shapeRandomOptions = new ShapeRandom();
        Arrays.stream(shapeRandomOptions.getShape()).forEach(x->x.drav());

    }
}
