import com.zrthas.until.UUIDTool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UUIDTest {
    @Test
    public void testFindUserById(){

        System.out.println(UUIDTool.getUUID());
        System.out.println(UUIDTool.getUUID());
        System.out.println(UUIDTool.getUUID());
        System.out.println(UUIDTool.getUUID());
        System.out.println(UUIDTool.getUUID());
        System.out.println(UUIDTool.getUUID());
        System.out.println(UUIDTool.getUUID());
        System.out.println(UUIDTool.getUUID());
    }
}
