package Pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import Skills.*;

public class Baltoy extends Pokemon {
    public Baltoy(String name, int lvl){
        super(name, lvl);
        this.setType(Type.GROUND,Type.PSYCHIC);
        this.setStats(40,40,55,40,70,55);
        this.setMove(new ShadowBall(), new ChargeBeam(), new RockPolish());
    }
}
