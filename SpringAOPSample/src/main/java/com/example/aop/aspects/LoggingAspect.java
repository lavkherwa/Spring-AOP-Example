package com.example.aop.aspects;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

	@Pointcut("within(com.example..*) && @annotation(com.example.aop.annotations.Loggable)")
	public void loggableMethods() {
	}

	@Before("loggableMethods()")
	public void logMethod(JoinPoint jointPoint) {
		String methodName = jointPoint.getSignature().getName();
		Object[] arguments = jointPoint.getArgs();

		logger.info("Before Aspect called for method: " + methodName);
		logger.info("Before Aspect argument value is: " + arguments[0].toString());
	}

	@AfterReturning(value = "loggableMethods()", returning = "result")
	public void logMethodCall(JoinPoint jointPoint, Object result) throws Throwable {
		String methodName = jointPoint.getSignature().getName();

		logger.info("After aspect called for method " + methodName);
		logger.info("After aspect result value is " + result.toString());
	}

	@Around("loggableMethods()")
	public Object measureMethodExecutionTime(ProceedingJoinPoint pjp) throws Throwable {
		// Before the target method is called
		long start = System.nanoTime();

		// This will call the target method
		Object retval = pjp.proceed();

		// After the target method returns
		long end = System.nanoTime();

		String methodName = pjp.getSignature().getName();
		logger.info("Around Aspect called for method " + methodName + " took "
				+ TimeUnit.NANOSECONDS.toMillis(end - start) + " ms");

		return retval;
	}
}
