package yuanxing;

import java.util.concurrent.ConcurrentHashMap;

public class squareCache {
    private static ConcurrentHashMap<String,shape> shapeMap = new ConcurrentHashMap();
    public static shape getShape(String shapeId) throws CloneNotSupportedException {
        shape temp = shapeMap.get(shapeId);
        return (shape) temp.clone();
    }
    public static void loadCache(){
        shape Circle = new circle();
        Circle.setId("1");
        shapeMap.put(Circle.getId(),Circle);

        shape Tangle = new circle();
        Tangle.setId("2");
        shapeMap.put(Tangle.getId(),Tangle);

        shape Square = new circle();
        Square.setId("1");
        shapeMap.put(Square.getId(),Square);

    }
}
