
package bean;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


@MessageDriven(mappedName = "myqueue", activationConfig = {
    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class ConsumerBean implements MessageListener {
    
    public ConsumerBean() {
        System.out.println("MDB created...");
    }
    @Override
    public void onMessage(Message message) {
        try {
            if(message instanceof TextMessage)
            {
                TextMessage txtmsg=(TextMessage)message;
                System.out.println(txtmsg.getText());
            }
        } catch (Exception e) {
            System.out.println("ERROR"+e);
        }
    }
}
