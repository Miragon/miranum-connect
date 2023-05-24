package io.miranum.platform.engine.application.port.out.processconfig;


import io.miranum.platform.engine.application.port.out.schema.JsonSchemaNotFoundException;
import io.miranum.platform.engine.domain.processconfig.ProcessConfig;

/**
 * Port to access the schema.
 */
public interface ProcessConfigPort {

    /**
     * Load schema by id.
     *
     * @param schemaId id of the schema.
     * @return schema
     * @throws JsonSchemaNotFoundException if no schema is available or access is restricted.
     */
    ProcessConfig getByRef(String schemaId) throws JsonSchemaNotFoundException;
}
