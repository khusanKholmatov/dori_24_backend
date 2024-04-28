package uz.dori24.dori24.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


@Configuration
public class OpenApiConfiguration {

    private static final String BEARER_FORMAT = "JWT";
    private static final String SCHEME = "Bearer";
    private static final String SECURITY_SCHEME_NAME = "Security Scheme";


    @Bean
    public OpenAPI api() {
        return new OpenAPI()
//                .schemaRequirement(SECURITY_SCHEME_NAME, getSecurityScheme())
                .servers(this.getServers())
                .security(this.getSecurityRequirement());
    }

    private List<Server> getServers() {

        List<Server> servers = new ArrayList<>();
        Server localLocalServer = new Server();
        localLocalServer.url("http://localhost:8080/api");
        localLocalServer.description("DEV server Gateway with HTTPS");
        servers.add(localLocalServer);
        Server localLocalServerHTTP = new Server();
        localLocalServerHTTP.url("http://localhost:8080/api");
        localLocalServerHTTP.description("DEV server Gateway with HTTP");
        servers.add(localLocalServerHTTP);
        return servers;
    }


    private List<SecurityRequirement> getSecurityRequirement() {
        SecurityRequirement securityRequirement = new SecurityRequirement();
        securityRequirement.addList(SECURITY_SCHEME_NAME);
        return List.of(securityRequirement);
    }

//    private SecurityScheme getSecurityScheme() {
//        SecurityScheme securityScheme = new SecurityScheme();
//        securityScheme.bearerFormat(BEARER_FORMAT);
//        securityScheme.type(SecurityScheme.Type.HTTP);
//        securityScheme.in(SecurityScheme.In.HEADER);
//        securityScheme.scheme(SCHEME);
//        return securityScheme;
//    }


}
