package ir.microservices.zuul.gateway.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class MicroserviceZuulReverseProxy {

	@Bean
	public MyZuulFilter filter(){
		return new MyZuulFilter();
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceZuulReverseProxy.class, args);
	}
	
}
