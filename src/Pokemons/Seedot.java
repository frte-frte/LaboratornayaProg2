package Pokemons;

import ru.ifmo.se.pokemon.*;
import Skills.*;

public class Seedot extends Pokemon {
    public Seedot(String name, int lvl){
        super(name, lvl);
        this.setType(Type.GRASS);
        this.setStats(40,40,50,30,30,30);
        this.setMove(new Facade(), new Swagger());
    }
}
