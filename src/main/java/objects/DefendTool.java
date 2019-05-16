package objects;

public enum DefendTool {
        CLOAKOFINVINCIBILITY(new Tool (10)),
        SHIELD(new Tool (4)),
        CHAINMAIL(new Tool (2));

        private final Tool defence;

        DefendTool(Tool defence){
            this.defence = defence;
        }

        public int getDefence() {
            return defence.getValue();
        }
}
