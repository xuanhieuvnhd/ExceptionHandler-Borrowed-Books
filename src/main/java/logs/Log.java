package logs;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.Arrays;

@Aspect
@Component
public class Log {
    private static final Logger LOGGER = LogManager.getLogger(Log.class);


    @Around("execution(public * service.impl.BookServiceImpl.* (..)))")
    public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();


        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();
        String args = Arrays.toString(proceedingJoinPoint.getArgs());

        final StopWatch stopWatch = new StopWatch();


        stopWatch.start();
        Object result = proceedingJoinPoint.proceed();
        stopWatch.stop();


        LOGGER.info("Execution time of " + className + "." + methodName + "." + args + " :: " + stopWatch.getTotalTimeMillis() + " ms");

        return result;
    }
}