package com.example.aop.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ServiceAspect {

	private Logger logger = Logger.getLogger(ServiceAspect.class.getName());

	/* Aspect should be called for all the methods of service class MyService */
	@Pointcut("within(com.example..*) && execution(* com.example.aop.service.MyService.*(..))")
	public void serviceMethods() {
	}

	@Before("serviceMethods()")
	public void logMethodCall(JoinPoint jp) {
		String methodName = jp.getSignature().getName();
		logger.info("Before aspect called for method: " + methodName);
	}

}
