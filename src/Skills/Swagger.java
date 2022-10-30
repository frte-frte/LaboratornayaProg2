package Skills;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 0.86);
    }

    @Override
    protected String describe(){
        return("использует Swagger");
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
    }
}
