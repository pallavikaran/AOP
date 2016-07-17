package aop;

import java.lang.reflect.Method;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.ThrowsAdvice;

public class LoggerAdvice implements 
	AfterReturningAdvice,ThrowsAdvice{
	
	// public void afterThrowing(<Exception> e)
	public void afterThrowing(BankException e)
	{
		performLog("Advising Exception "+e);
	}
	
	
	
	
	public void afterReturning(Object returnObject,
			Method method, Object[] args,
			Object target) throws Throwable {
		
		performLog("Method "+method.getName()+" Completed");
	}
	
	public void performLog(String message){
		
		System.out.println("["+new Date()+"]:"+message);
	}
}









