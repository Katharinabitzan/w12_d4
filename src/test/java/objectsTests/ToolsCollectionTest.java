package objectsTests;

import objects.Tool;
import objects.ToolsCollection;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToolsCollectionTest {

    ToolsCollection toolsCollection;
    Tool tool;
    Tool betterTool;

    @Before
    public void before(){
        toolsCollection = new ToolsCollection();
        tool = new Tool(2);
        betterTool = new Tool(10);
    }

    @Test
    public void canGetToolsCount(){
        assertEquals(0, toolsCollection.toolsCount());
    }

    @Test
    public void canAddTool(){
        toolsCollection.add(tool);
        assertEquals(1, toolsCollection.toolsCount());
    }

    @Test
    public void canRemoveTool(){
        toolsCollection.add(tool);
        toolsCollection.remove(tool);
        assertEquals(0, toolsCollection.toolsCount());
    }

    @Test
    public void canCheckIndexOfTool(){
        toolsCollection.add(tool);
        toolsCollection.add(betterTool);
        assertEquals(0, toolsCollection.indexOf(tool));
    }

    @Test
    public void canSwapTool(){
        toolsCollection.add(tool);
        toolsCollection.add(betterTool);
        toolsCollection.change(betterTool);
        assertEquals(0, toolsCollection.indexOf(betterTool));
    }
}
