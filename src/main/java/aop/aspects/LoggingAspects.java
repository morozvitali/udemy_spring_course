package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {

    @Before("execution (public void getBook())")
    public void beforeGetBook (JoinPoint joinPoint) {
        System.out.println(" Before Method: try get book ");



    }

}
