import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest 
{
    @Test 
    public void AddTest()
    {
        assertEquals(2, SkillDemo.add(1, 1));
    }
}
