package objects;

public enum AttackTool {
    SWORD(new Tool(3)),
    AXE(new Tool (2)),
    CLUB(new Tool (1)),
    HAMMER(new Tool (2));

    private final Tool attack;

    AttackTool(Tool attack){
        this.attack = attack;
    }

    public int getAttack() {
        return attack.getValue();
    }
}
