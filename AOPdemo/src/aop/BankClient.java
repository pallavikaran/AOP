package aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BankClient {

    public static void main(String[] args) {
        try {
            Resource res = new ClassPathResource(
                    "aop/aop.xml");
            BeanFactory factory = new XmlBeanFactory(res);
            Bank service = (Bank) factory.getBean("bankService");
            service.getBalance(1002);
            //service.transfer(-1001, 1002, 1000);

        } catch (BankException e) {
            System.out.println("Handling Exception in Main");
            e.printStackTrace();
        }
    }
}
