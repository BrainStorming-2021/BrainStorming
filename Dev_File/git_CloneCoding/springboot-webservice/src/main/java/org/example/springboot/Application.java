package org.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication  //스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성 모두 자동 설정됨.
                        //특히, @SpringBootApplication 이 있는 위치부터 설정을 읽기때문에 이 클래스는 항상 프로젝트 최상단이어야함.
//@EnableJpaAuditing
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
