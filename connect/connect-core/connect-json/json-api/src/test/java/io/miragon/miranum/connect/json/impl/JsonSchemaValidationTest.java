package io.miragon.miranum.connect.json.impl;

import io.miragon.miranum.connect.json.api.JsonSchema;
import io.miragon.miranum.connect.json.api.ValidationResult;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

import static io.miragon.miranum.connect.json.utils.JsonSchemaTestUtils.getSchemaString;
import static java.util.Map.entry;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JsonSchemaValidationTest {


    @Test
    public void test_readonly_error() throws IOException, URISyntaxException {
        final String rawSchema = getSchemaString("/schema/schema.json");
        final JsonSchema schema = this.getSchemaFronString(rawSchema);

        final Map<String, Object> actualData = Map.ofEntries(
                entry("stringProp1", "fsdafsda"),
                entry("numberProp1", 1),
                entry("booleanprop", false)
        );

        final Map<String, Object> previousData = Map.ofEntries(
                entry("dateprop", "20"),
                entry("numberProp1", 1),
                entry("booleanprop", true)
        );

        final List<ValidationResult> result = schema.validate(actualData, previousData);

        assertTrue(result.size() > 0);
    }

    @Test
    public void test_data_valid() throws IOException, URISyntaxException {
        final String rawSchema = getSchemaString("/schema/schema.json");
        final JsonSchema schema = this.getSchemaFronString(rawSchema);

        final Map<String, Object> actualData = Map.ofEntries(
                entry("stringProp1", "fsdafsda"),
                entry("numberProp1", 1)
        );

        final Map<String, Object> previousData = Map.ofEntries(
                entry("dateprop", "20"),
                entry("numberProp1", 1),
                entry("booleanprop", true)
        );

        final List<ValidationResult> result = schema.validate(actualData, previousData);

        assertEquals(0, result.size());
    }

    @Test
    public void test_additional_data() throws IOException, URISyntaxException {
        final String rawSchema = getSchemaString("/schema/schema.json");
        final JsonSchema schema = this.getSchemaFronString(rawSchema);

        final Map<String, Object> actualData = Map.ofEntries(
                entry("stringProp1", "fsdafsda"),
                entry("numberProp1", 1),
                entry("notInSchemaKey", 1)
        );

        final Map<String, Object> previousData = Map.ofEntries(
                entry("dateprop", "20"),
                entry("numberProp1", 1),
                entry("booleanprop", true)
        );

        final List<ValidationResult> result = schema.validate(actualData, previousData);

        assertEquals(1, result.size());
    }

    @Test
    public void test_user_schema() throws IOException, URISyntaxException {
        final String rawSchema = getSchemaString("/schema/additional-data-schema.json");
        final JsonSchema schema = this.getSchemaFronString(rawSchema);

        final Map<String, Object> actualData = Map.ofEntries(
                entry("addressOrUser", Map.ofEntries(
                        entry("city", "Augsburg"),
                        entry("name", "Dom"),
                        entry("street_address", "Augstreet 1"),
                        entry("state", "Bavaria"),
                        entry("mail", "test@mail.de")))
        );

        final List<ValidationResult> result = schema.validate(actualData);

        assertEquals(0, result.size());
    }

    @Test
    public void textarea_with_maxlength_is_valid() throws URISyntaxException, IOException {
        final Map<String, Object> acutalData = Map.ofEntries(
                entry("numberProp1", 12),
                entry("GrundDienstlNotwendigkeit", "fdsfsdafsdafadsfsadfsdafd")
        );
        final String rawSchema = getSchemaString("/schema/text-area-schema.json");
        final JsonSchema schema = this.getSchemaFronString(rawSchema);


        final List<ValidationResult> results = schema.validate(acutalData);

        assertEquals(0, results.size());
    }

    @Test
    public void one_of_is_valid() throws URISyntaxException, IOException {
        final Map<String, Object> acutalData = Map.ofEntries(
                entry("stringProp1", "stringprop"),
                entry("schemaKey", "subSchema1")
        );
        final String rawSchema = getSchemaString("/schema/one-of-schema.json");
        final JsonSchema schema = this.getSchemaFronString(rawSchema);

        final List<ValidationResult> results = schema.validate(acutalData);

        assertEquals(0, results.size());
    }

    @Test
    public void one_of_is_invalid() throws URISyntaxException, IOException {
        final Map<String, Object> acutalData = Map.ofEntries(
                entry("stringProp1", "stringprop"),
                entry("schemaKey", "subSchema1"),
                entry("stringProp3", "stringprop")
        );
        final String rawSchema = getSchemaString("/schema/one-of-schema.json");
        final JsonSchema schema = this.getSchemaFronString(rawSchema);

        final List<ValidationResult> results = schema.validate(acutalData);

        assertTrue(results.size() > 0);
    }

    @Test
    public void select_schema_with_wrong_data_fails() throws URISyntaxException, IOException {
        final Map<String, Object> acutalData = Map.ofEntries(
                entry("stringProp1", "fdsfsdafsdafadsfsadfsdafd"),
                entry("selection", "test3")
        );
        final String rawSchema = getSchemaString("/schema/complex-schema.json");
        final JsonSchema schema = this.getSchemaFronString(rawSchema);
        final List<ValidationResult> results = schema.validate(acutalData);

        assertEquals(2, results.size());
    }

    @Test
    public void object_schema_list_valid() throws IOException, URISyntaxException {
        final String rawSchema = getSchemaString("/schema/object-list-schema.json");
        final JsonSchema schema = this.getSchemaFronString(rawSchema);

        final Map<String, Object> actualData = Map.ofEntries(
                entry("person", List.of(
                                Map.ofEntries(
                                        entry("vorname", "Dom"),
                                        entry("nachname", "Hrn")
                                )
                        )
                )
        );

        final List<ValidationResult> result = schema.validate(actualData);

        assertEquals(0, result.size());
    }

    @Test
    public void object_schema_list_invalid() throws IOException, URISyntaxException {
        final String rawSchema = getSchemaString("/schema/object-list-schema.json");
        final JsonSchema schema = this.getSchemaFronString(rawSchema);

        final Map<String, Object> actualData = Map.ofEntries(
                entry("person", List.of(
                                Map.ofEntries(
                                        entry("vorname", "Dom"),
                                        entry("nachname", "Hrn")),
                                Map.ofEntries(
                                        entry("vorname", "Dom"),
                                        entry("street", "InvalidStreet"),
                                        entry("nachname", "Hrn"))
                        )
                )
        );

        final List<ValidationResult> result = schema.validate(actualData);

        assertEquals(1, result.size());
    }

    protected JsonSchema getSchemaFronString(final String schemaContent) {
        return JsonSchemaFactory.createJsonSchema(schemaContent);
    }

}
