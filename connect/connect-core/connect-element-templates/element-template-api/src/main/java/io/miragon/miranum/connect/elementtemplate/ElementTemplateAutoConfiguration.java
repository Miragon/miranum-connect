package io.miragon.miranum.connect.elementtemplate;

import io.miragon.miranum.connect.elementtemplate.impl.ElementTemplateGenerationDelegate;
import io.miragon.miranum.connect.elementtemplate.impl.ElementTemplatesGenerator;
import io.miragon.miranum.connect.elementtemplate.impl.ElementTemplateInfoMapper;
import io.miragon.miranum.connect.elementtemplate.impl.GenerateElementTemplatePort;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ElementTemplateGenerationDelegate.class)
@AllArgsConstructor
public class ElementTemplateAutoConfiguration {

    private final GenerateElementTemplatePort generateElementTemplatePort;

    @Bean
    public ElementTemplateInfoMapper elementTemplateInfoMapper() {
        return new ElementTemplateInfoMapper();
    }

    @Bean
    public ElementTemplatesGenerator elementTemplateGenerator() {
        return new ElementTemplatesGenerator(generateElementTemplatePort);
    }
}