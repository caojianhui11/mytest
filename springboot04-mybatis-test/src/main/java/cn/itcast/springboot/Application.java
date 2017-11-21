package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
public class Application {
      public static void main(String[] args) {
		//第二种方式,用run方法运行Spring Boot应用
    	  SpringApplication springApplication = new SpringApplication(Application.class); 
  		/** 设置横幅模式: 关闭 */
  		springApplication.setBannerMode(Mode.OFF);
  		/** 运行 */
  		springApplication.run(args);
	}
}
