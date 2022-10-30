package Pokemons;

import ru.ifmo.se.pokemon.*;
import Skills.*;

public class Marshadow extends Pokemon {
    public Marshadow(String name, int lvl){
        super(name, lvl);
        this.setType(Type.FIGHTING, Type.GHOST);
        this.setStats(90, 125,80,90,90,125);
        this.setMove(new SonicBoom(), new DoubleTeam(), new IronDefense(), new Swagger());
    }
}
