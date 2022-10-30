package Pokemons;

import ru.ifmo.se.pokemon.Type;
import Skills.*;

public class Claydol extends Baltoy {
    public Claydol(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.GROUND,Type.PSYCHIC);
        this.setStats(60,70,105,70,120,75);
        this.setMove(new ShadowBall(), new ChargeBeam(), new RockPolish(), new StoneEdge());
    }
}
