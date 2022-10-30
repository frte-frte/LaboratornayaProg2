import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main {
    public static void main(String[] args) {

        Battle b = new Battle();
        Pokemon p1 = new Marshadow("Джонатан Джостар", 1);
        Pokemon p2 = new Baltoy("Джозеф Джостар", 1);
        Pokemon p3 = new Claydol("Джотаро Куджо", 1);
        Pokemon p4 = new Seedot("Джоске Хигашикато", 1);
        Pokemon p5 = new Nuzleaf("Джорно Джована", 1);
        Pokemon p6 = new Shiftry("Джолин Куджо", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p4);
        b.addFoe(p3);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}

