package Skills;

import ru.ifmo.se.pokemon.*;

public class LeafStorm extends SpecialMove {
    public LeafStorm(){
        super(Type.GRASS, 130, 0.9);
    }

    @Override
    protected String describe(){
        return("использует Leaf Storm");
    }
}
