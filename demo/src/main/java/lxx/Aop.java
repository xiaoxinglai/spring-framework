package lxx;

import Service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Aop
 * @Author laixiaoxing
 * @Date 2019/11/9 下午8:19
 * @Description TODO
 * @Version 1.0
 */
public class Aop {

    public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[]{"spring.xml"});
		UserService userService = (UserService)applicationContext.getBean("userService");
		userService.login();

    }
}
