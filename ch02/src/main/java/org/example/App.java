package org.example;

import org.example.config.Appconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 날짜 : 2026/06/15
 * 이름 : 허민재
 * 내용 : 2장 스프림 IoC/DI 실습
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // 기존 전통적인 객체 생성
        Hello hello = new Hello();
        hello.show();

        Welcome welcome = new Welcome();
        welcome.show();

        Greeting greeting = new Greeting();
        greeting.show();

        // IoC/DI 방식(제어의 역전)

        // 스프링 컨테이너 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);

        // 주입하기
        Hello helloBean = context.getBean(Hello.class);
        helloBean.show();

        Welcome welcomeBean = (Welcome) context.getBean("w"); // 빈 name 값으로 가져오기
        welcomeBean.show();

        Greeting greetingBean = (Greeting) context.getBean("g");
        welcomeBean.show();
    }
}
