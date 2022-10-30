package Skills;

import ru.ifmo.se.pokemon.*;

public class SonicBoom extends SpecialMove {
    public SonicBoom() {
        super(Type.NORMAL, 0, 0.9);
    }

    @Override
    protected String describe() {
        return ("использует Sonic Boom");
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (!p.hasType(Type.GHOST)){
            p.setMod(Stat.HP, -20);
        }
    }
}