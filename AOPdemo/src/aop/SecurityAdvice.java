package aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// Advice: Security for Before
public class SecurityAdvice implements MethodBeforeAdvice{
    
                @Override
	public void before(Method method,
			Object[] args, Object target)
			throws Throwable {
		System.out.println("Check security for Method "
				+ method.getName());
		boolean result = checkAccountId((Integer)args[0]);
		System.out.println("Security Result "+result);
	}

	public boolean checkAccountId(int accId){
		System.out.println("Checking Account "+accId);
		if(accId<0) {
			return false;
		}
		else{
			return true;
		}
	}
	
	
}








