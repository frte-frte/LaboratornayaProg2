package Skills;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove{
    public StoneEdge(){
        super(Type.ROCK, 100, 0.8);
    }

    @Override
    protected String describe(){
        return("использует Stone Edge");
    }
}
