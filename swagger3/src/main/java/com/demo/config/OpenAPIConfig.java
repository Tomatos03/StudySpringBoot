package com.demo.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Tomatos
 * @date : 2025/7/9
 */
// 该注解配置网站元数据
@OpenAPIDefinition(
        info = @Info(
                title = "示例Demo-Title",
                description = "This is demo description",
                version = "v1.0",
                contact = @Contact(
                        name = "name: Daming",
                        email = "111@qq.com",
                        url = "www.baidu.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0.html"
                )
        )
)
@Configuration
public class OpenAPIConfig {
}