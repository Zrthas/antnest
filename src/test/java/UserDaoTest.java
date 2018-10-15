import com.zrthas.dao.UserDao;
import com.zrthas.dao.user.UserEntityDao;
import com.zrthas.entity.User;
import com.zrthas.entity.user.UserEntity;
import com.zrthas.until.UUIDTool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserEntityDao userEntityDao;

    @Test
    public void testFindUserById(){
        int id = 1;
        User user = userDao.findUserById(id);
        System.out.println(user.getId()+":"+user.getUsername());
    }

    @Test
    public void testFindUser(){
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("zrthas");
        userEntity.setUserLoginName("zrthas");
        userEntity = userEntityDao.findUserExist(userEntity);
        System.out.println("用户登录名为："+userEntity.getUserName());
    }


    @Test
    public void testInsertUserEntity(){
        System.out.println("++++++++++++++++++++开始插入数据++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++当前时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()) +"++++++++++++++++++++++");
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(UUIDTool.getUUID());
        userEntity.setUserIdentityType("1");
        userEntity.setUserLoginName("DemoUser1");
        userEntity.setUserName("DemoUser1");
        userEntity.setUserStatus("1");
        userEntityDao.insertNewUser(userEntity);
        System.out.println("++++++++++++++++++++当前时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()) +"++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++结束插入数据++++++++++++++++++++++");

    }



}
