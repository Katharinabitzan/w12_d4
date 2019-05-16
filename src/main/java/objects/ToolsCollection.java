package objects;

import java.util.ArrayList;
import java.util.Collections;

public class ToolsCollection {

    private ArrayList<Tool> tools;

    public ToolsCollection(){
        this.tools = new ArrayList<>();
    }

    public void add(Tool tool){
        this.tools.add(tool);
    }

    public void remove(Tool tool){
        this.tools.remove(tool);
    }

    public void change(Tool chosenTool){
        Collections.swap(this.tools,0, this.tools.indexOf(chosenTool));
    }

    public int toolsCount(){
        return tools.size();
    }

    public int indexOf(Tool tool) {
        return this.tools.indexOf(tool);
    }
}
