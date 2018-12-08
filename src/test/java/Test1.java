import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jms.Destination;
import java.util.concurrent.CountDownLatch;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class Test1 {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Test
    public void test01(){
        Destination destination = new ActiveMQQueue("test");
        jmsMessagingTemplate.convertAndSend(destination, "test message");

    }

    @Test
    public void test02() throws InterruptedException {
        new CountDownLatch(1).await();
    }
}
