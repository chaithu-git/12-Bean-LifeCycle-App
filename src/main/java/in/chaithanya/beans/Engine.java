package in.chaithanya.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Engine {
	
	public Engine() {
		System.out.println("Engine :: Constructor");
	}
@PostConstruct
	public void inti() {
		System.out.println("engine start.....");
	}
@PreDestroy
	public void destroy() {
		System.out.println("Engine  stop........");
	}
}
