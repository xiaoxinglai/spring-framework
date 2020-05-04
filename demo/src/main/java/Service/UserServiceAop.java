package Service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserServiceAop
 * @Author laixiaoxing
 * @Date 2019/11/9 下午8:29
 * @Description TODO
 * @Version 1.0
 */
@Aspect
@Component
public class UserServiceAop {

    @Pointcut("execution(* Service.UserService.*(..))")
    private void log(){

    }

    @Before("UserServiceAop.log()")
    private void beforeLog(){
        System.out.println("before");
    }
}
