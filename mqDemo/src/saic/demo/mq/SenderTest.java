package saic.demo.mq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SenderTest {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Sender sender = (Sender) context.getBean("sender");
        sender.sendInfo();
    }
}
