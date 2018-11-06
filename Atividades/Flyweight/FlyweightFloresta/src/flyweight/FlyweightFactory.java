package flyweight;

import java.util.ArrayList;

public class FlyweightFactory {

    protected ArrayList<SpriteFlyweight> flyweights;

    public FlyweightFactory() {
        flyweights = new ArrayList<SpriteFlyweight>();
        flyweights.add(new Sprite("jogador.png"));
        flyweights.add(new Sprite("inimigo1.png"));
        flyweights.add(new Sprite("inimigo2.png"));
        flyweights.add(new Sprite("inimigo3.png"));
        flyweights.add(new Sprite("objeto1.png"));
        flyweights.add(new Sprite("objeto2.png"));
    }

    public SpriteFlyweight getFlyweight(String jogador) {
        switch (jogador) {
            case "JOGADOR":
                return flyweights.get(0);
            case "INIMIGO_1":
                return flyweights.get(1);
            case "INIMIGO_2":
                return flyweights.get(2);
            case "INIMIGO_3":
                return flyweights.get(3);
            case "CENARIO_1":
                return flyweights.get(4);
            default:
                return flyweights.get(5);
        }
    }
}
