package ru.itis.microservices.gateway;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bulat Giniyatullin
 * 01 October 2018
 */

@Primary
@Component
public class DocumentationController implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> swaggerResources = new ArrayList<>();
        swaggerResources.add(swaggerResource("cat", "/api/cat/v2/api-docs", "2.0"));
        swaggerResources.add(swaggerResource("country", "/api/country/v2/api-docs", "2.0"));
        swaggerResources.add(swaggerResource("userInfo", "/api/about/v2/api-docs", "2.0"));
        return swaggerResources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
