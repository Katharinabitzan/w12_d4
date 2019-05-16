package objectsTests;

import objects.Tool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToolTest {

    Tool tool;

    @Before
    public void before(){
        tool = new Tool(5);
    }

    @Test
    public void canGetToolValue(){
        assertEquals(5, tool.getValue());
    }


}
