package Skills;

import ru.ifmo.se.pokemon.*;

public class IronDefense extends StatusMove {
    public IronDefense() {
        super(Type.STEEL, 0, 0);
    }

    @Override
    protected String describe() {
        return ("использует Iron Defence");
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, 2);
    }
}
