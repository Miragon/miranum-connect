package io.miragon.miranum.connect.binder.adapter.camunda7;

import io.miragon.miranum.connect.binder.application.port.in.ExecuteMethodUseCase;
import io.miragon.miranum.connect.binder.application.port.out.BindUseCasePort;
import io.miragon.miranum.connect.binder.domain.BusinessException;
import io.miragon.miranum.connect.binder.domain.TechnicalException;
import io.miragon.miranum.connect.binder.domain.UseCaseInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
class Camunda7EmbeddedAdapter implements BindUseCasePort {

    private final ExecuteMethodUseCase executeMethodUseCase;

    @Override
    public void bind(final UseCaseInfo useCaseInfo) {

    }

    public void execute(final UseCaseInfo useCaseInfo) {
        try {

        } catch (final BusinessException exception) {
            log.error("business error detected", exception);
        } catch (final TechnicalException exception) {
            log.error("technical error detected", exception);
        } catch (final Exception exception) {
            log.error("general exception detected", exception);
        }
    }

}
