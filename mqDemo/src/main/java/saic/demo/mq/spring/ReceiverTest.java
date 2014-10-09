package saic.demo.mq.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReceiverTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Receiver receiver = (Receiver) context.getBean("receiver");
        System.out.print(receiver.receiveMessage());
    }
}