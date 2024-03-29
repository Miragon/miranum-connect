package io.miragon.miranum.connect.json;


import io.miragon.miranum.connect.json.api.JsonApi;
import io.miragon.miranum.connect.json.impl.JsonApiImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public JsonApi miranumJsonApi() {
        return new JsonApiImpl();
    }


}

