/*
 * Submission API für Antragsverfahren und Berichtspflichten
 * Die FIT-Connect Submission API ermöglicht das Einreichen von Anträgen und Berichten aus vorgelagerten Systemen (z. B. Onlineantragsdiensten, Fachportalen oder Berichtssystemen) an die Systeme der Verwaltung zur elektronischen Verfahrensbearbeitung (z. B. Fachverfahren, Dokumentenmanagementsysteme oder Prozessplattformen). 
 *
 * The version of the OpenAPI document: 1.1.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.miragon.miraum.fitconnect.integration.gen.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Eine einzelne abholbereite Einreichung, abzurufen beim Zustellpunkt mit der angegebenen &#x60;destinationId&#x60;.
 */
@ApiModel(description = "Eine einzelne abholbereite Einreichung, abzurufen beim Zustellpunkt mit der angegebenen `destinationId`.")
@JsonPropertyOrder({
  SubmissionForPickup.JSON_PROPERTY_DESTINATION_ID,
  SubmissionForPickup.JSON_PROPERTY_SUBMISSION_ID,
  SubmissionForPickup.JSON_PROPERTY_CASE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubmissionForPickup {
  public static final String JSON_PROPERTY_DESTINATION_ID = "destinationId";
  private UUID destinationId;

  public static final String JSON_PROPERTY_SUBMISSION_ID = "submissionId";
  private UUID submissionId;

  public static final String JSON_PROPERTY_CASE_ID = "caseId";
  private UUID caseId;

  public SubmissionForPickup() {
  }

  public SubmissionForPickup destinationId(UUID destinationId) {
    
    this.destinationId = destinationId;
    return this;
  }

   /**
   * Identifikator des Zustellpunktes im Format einer UUID
   * @return destinationId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifikator des Zustellpunktes im Format einer UUID")
  @JsonProperty(JSON_PROPERTY_DESTINATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getDestinationId() {
    return destinationId;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestinationId(UUID destinationId) {
    this.destinationId = destinationId;
  }


  public SubmissionForPickup submissionId(UUID submissionId) {
    
    this.submissionId = submissionId;
    return this;
  }

   /**
   * Identifikator der Einreichung im Format einer UUID
   * @return submissionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifikator der Einreichung im Format einer UUID")
  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getSubmissionId() {
    return submissionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBMISSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubmissionId(UUID submissionId) {
    this.submissionId = submissionId;
  }


  public SubmissionForPickup caseId(UUID caseId) {
    
    this.caseId = caseId;
    return this;
  }

   /**
   * Vorgangsreferenz des Vorgangs, zu der die Einreichung gehört.
   * @return caseId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Vorgangsreferenz des Vorgangs, zu der die Einreichung gehört.")
  @JsonProperty(JSON_PROPERTY_CASE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getCaseId() {
    return caseId;
  }


  @JsonProperty(JSON_PROPERTY_CASE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCaseId(UUID caseId) {
    this.caseId = caseId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionForPickup submissionForPickup = (SubmissionForPickup) o;
    return Objects.equals(this.destinationId, submissionForPickup.destinationId) &&
        Objects.equals(this.submissionId, submissionForPickup.submissionId) &&
        Objects.equals(this.caseId, submissionForPickup.caseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationId, submissionId, caseId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionForPickup {\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

