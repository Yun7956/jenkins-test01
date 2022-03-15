package my.distributed.locks.app;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 引导类
 * 
 * @author young
 *
 */

@SpringBootApplication
//@MapperScan("com.my.dao")
@ComponentScan("my.distributed.locks")
public class MyDistributedLocksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDistributedLocksApplication.class, args);
	}

}
