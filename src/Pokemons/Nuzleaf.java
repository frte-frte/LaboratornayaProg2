package Pokemons;

import ru.ifmo.se.pokemon.Type;
import Skills.*;

public class Nuzleaf extends Seedot{
    public Nuzleaf(String name, int lvl){
        super(name, lvl);
        this.setType(Type.GRASS, Type.DARK);
        this.setStats(70,70,40,60,40,60);
        this.setMove(new Facade(), new Swagger(), new Harden());
    }
}
