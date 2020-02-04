package cn.hanff.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * Created by smlz on 2019/6/10.
 */
@Aspect
public class TulingLogAspect {

    @Pointcut("execution(* com.tuling.aop.TulingCalculate.*(..))")
    public void pointCut(){};

    @Before(value = "pointCut()")
    public void methodBefore(JoinPoint joinPoint){

        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行目标方法【"+methodName+"】之前执行<前置通知>,入参"+ Arrays.asList(joinPoint.getArgs()));
    }

    @After(value = "pointCut()")
    public void methodAfter(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行目标方法【"+methodName+"】之前执行<后置通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }

    @AfterReturning(value = "pointCut()")
    public void methodReturning(JoinPoint joinPoint ) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行目标方法【"+methodName+"】之前执行<返回通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }

    @AfterThrowing(value = "pointCut()")
    public void methodAfterThrowing(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行目标方法【"+methodName+"】之前执行<异常通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }

/*    @Around(value = "pointCut()")
    public void methodAfterThrowing(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("执行目标方法【"+methodName+"】之前执行<环绕通知>,入参"+joinPoint.getArgs());
        try {
            //调用目标方法
            joinPoint.proceed();
        } catch (Throwable throwable) {
            System.out.println("调用目标方法异常:"+throwable.getMessage());
            throwable.printStackTrace();
        }
    }*/
}
