package Skills;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(){
        super(Type.ELECTRIC, 50, 0.9);
    }

    @Override
    protected String describe(){
        return("использует Charge Beam");
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        if (Math.random() <= 0.7) {
            p.setMod(Stat.SPECIAL_ATTACK, 1);
        }
    }
}
