package io.miranum.platform.engine.processdefinition.api.transport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.Map;

/**
 * Transport object of the ServiceDefinitionDetail object
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDefinitionDetailTO {

    /**
     * json schema
     */
    private Map<String, Object> jsonSchema;

    /**
     * Key of the service definition.
     * Used to start the service.
     */
    @NotBlank
    private String key;

    /**
     * Name
     */
    @NotBlank
    private String name;

    /**
     * Description
     */
    private String description;

    /**
     * version tag
     */
    private String versionTag;

}
