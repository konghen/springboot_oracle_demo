package net.chinanets.sj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.chinanets.sj.mapper")
public class SjApplication {

	//java -jar sj-0.0.1-SNAPSHOT.jar --server.port=80 启动项目时修改端口号
	public static void main(String[] args) {
		SpringApplication.run(SjApplication.class, args);
	}
}
