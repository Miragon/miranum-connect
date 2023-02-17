package io.miragon.miranum.examples.pizzaorder.email;

import io.miragon.miranum.integrations.mail.application.port.in.SendMailUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MiranumCustomerNotificationAdapterConfiguration {

    @Bean
    public MiranumCustomerNotificationAdapter miranumCustomerNotificationAdapter(final SendMailUseCase sendMailUseCase) {
        return new MiranumCustomerNotificationAdapter(sendMailUseCase);
    }
}
