package edu.spring.domain.impl;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@ComponentScan(basePackages={"edu.spring.domain"})
public class HelloWorldMinConfiguration {

}
