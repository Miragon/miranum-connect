package io.miragon.miranum.connect.worker.application.port.out;


import io.miragon.miranum.connect.worker.domain.WorkerInfo;

public interface BindWorkerPort {

    void bind(WorkerInfo useCaseInfo);

}