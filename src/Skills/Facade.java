package Skills;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 1);
    }

    @Override
    protected String describe() {
        return ("использует Facade");
    }
}
