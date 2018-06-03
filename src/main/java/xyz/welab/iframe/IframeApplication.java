package xyz.welab.iframe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *@Author:guoqing22
 *@Description:
 *@Date:15:45 2018/3/14
 */
@SpringBootApplication
@MapperScan("xyz.welab.iframe.model")
@EnableSwagger2
public class IframeApplication {

	public static void main(String[] args) {
		SpringApplication.run(IframeApplication.class, args);
	}
}
