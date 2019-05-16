package characters;

import behaviours.IExist;
import objects.AttackTool;
import objects.DefendTool;
import objects.ToolsCollection;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Character implements IExist {

    IExist characterType;
    ToolsCollection attackTools;
    ToolsCollection defendTools;

    public Character(IExist characterType) {
        this.characterType = characterType;
        this.attackTools = new ToolsCollection();
        this.defendTools = new ToolsCollection();
    }

    @Override
    public int getStartingHealth() {
        return characterType.getStartingHealth();
    }

    @Override
    public int getAttack() {
        return characterType.getAttack();
    }

    @Override
    public int getDefence() {
        return characterType.getDefence();
    }
}
