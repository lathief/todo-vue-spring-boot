package com.rebel.todoapi.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI todoAPI(@Value("Swagger UI for TODO API") String appDescription,
                                  @Value("v1.0.0") String appVersion
    ) {
        Server server = new Server();
        server.setUrl("https://localhost:8081/api/");
        List<Server> listOfServer = new ArrayList<>();
        listOfServer.add(server);

        return new OpenAPI()
                .info(new Info()
                        .title("TODO API")
                        .version(appVersion)
                        .description(appDescription)
                ).servers(listOfServer);
    }
}
