package io.miragon.miranum.integrations.example;

import io.miragon.miranum.connect.worker.api.WorkerInterceptor;
import io.miragon.miranum.integrations.example.application.port.in.FireAndForgetUseCase;
import io.miragon.miranum.integrations.example.application.port.in.SendMessageUseCase;
import io.miragon.miranum.integrations.example.application.port.out.TenantInterceptor;
import io.miragon.miranum.integrations.example.application.service.FireAndForgetService;
import io.miragon.miranum.integrations.example.application.service.SendMessageService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class ExampleConfiguration {

    @Bean
    public SendMessageUseCase sendMessageUseCase() {
        return new SendMessageService();
    }

    @Bean
    public FireAndForgetUseCase fireAndForgetUseCase() {
        return new FireAndForgetService();
    }

    @Bean
    public WorkerInterceptor tenantInterceptor() {
        return new TenantInterceptor();
    }
}