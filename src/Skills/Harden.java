package Skills;

import ru.ifmo.se.pokemon.*;

public class Harden extends StatusMove {
    public Harden(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe(){
        return("использует Harden");
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, 1);
    }
}
