package io.github.libai8723;

/**
 * 现在再来看这个SIA 4th中的开篇的例子就感触多了很多了
 * SpringJUnit4ClassRunner是一个Spring框架提供的Runner，按照junit3的Test infected的文章来说，runner主要的作用是提供环境的
 * 在这个例子中其实SpringJUnit4ClassRunner就是一个Runner，这个Runner提供的主要作用就是创建一个Spring Application Context
 * 因为所有的Spring程序都需要在Spring Application Context中才能运行，就算是单元测试函数也是一样的
 */

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//RunWith是Junit4的一个注解，现在看来就是说明使用什么Runner来运行这些测试类
@RunWith(SpringJUnit4ClassRunner.class)
//ContextConfiguration是spring的test.context中的注解，指明配置类在哪里
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;
    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }
}