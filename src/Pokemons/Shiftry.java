package Pokemons;

import ru.ifmo.se.pokemon.*;
import Skills.*;

public class Shiftry extends Nuzleaf {
    public Shiftry(String name, int lvl){
        super(name, lvl);
        this.setType(Type.WATER);
        this.setStats(90,100,60,90,60,80);
        this.setMove(new Facade(), new Swagger(), new Harden(), new LeafStorm());
    }
}
