package io.miragon.miranum.connect.task;


import io.miragon.miranum.connect.task.impl.CompleteTaskPort;
import io.miragon.miranum.connect.task.impl.TaskApiImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskAutoConfiguration {

    @Bean
    public TaskApiImpl miranumTaskApi(final CompleteTaskPort completeTaskPort) {
        return new TaskApiImpl(completeTaskPort);
    }
}

