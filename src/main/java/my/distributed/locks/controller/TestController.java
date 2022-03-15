package my.distributed.locks.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	private static  final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

	//@Value("${name}")
	private String name;
	
	/*@Value("${person.name}")
	private String name2;
	
	@Value("${person.age}")
	private int age;*/

	/*@RequestMapping("/hello01")
	public String hello() {
		System.out.println("name的值：" + name);
		System.out.println("name2的值：" + name2);
		System.out.println("age的值：" + age);
		
		System.out.println("---------------------");
		System.out.println(person);
		
		return "hello spring boot111";
	}*/

	@RequestMapping("/hello02")
	public String hello02() {
		LOGGER.info("it is my distributed locks");
		return "my-distributed-locks";
	}
	
	@RequestMapping("/test01")
	public String test01() {
		LOGGER.info("test01-这个是master分支");
		return "test01-这个是master分支";
	}
	
	@RequestMapping("/redistest01")
	public String redistest01() {
		return "redistest01";
	}
	


}
