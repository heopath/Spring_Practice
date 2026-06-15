package org.example.config;

import org.example.sub1.Greeting;
import org.example.sub1.Hello;
import org.example.sub1.Welcome;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// 해당 클래스를 스프링 설정 클래스로 등록
@Configuration

// 빈등록 하라는 클래스를 위치를 찾을 수 있게 스캐닝 패키지 설정
@ComponentScan(basePackages = "org.example")

// AOP 활성화 설정
@EnableAspectJAutoProxy
public class Appconfig {

    // @Bean 어노테이션으로 해당 메서드를 초기해 한번 호출해서 Hello 객체를 스프링 컨테이너에 등록
    @Bean
    public Hello hello(){
        return new Hello();
    }
    @Bean(name = "w")
    public Welcome welcome(){
        return new Welcome();
    }
    @Bean("g")
    public Greeting greeting(){
        return new Greeting();
    }
}
