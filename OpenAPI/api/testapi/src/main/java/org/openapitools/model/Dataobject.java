package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dataobject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-18T11:45:55.900914-07:00[America/Los_Angeles]")
public class Dataobject   {
  @JsonProperty("action")
  private String action;

  @JsonProperty("field1")
  private String field1;

  @JsonProperty("field2")
  private String field2;

  public Dataobject action(String action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */
  @ApiModelProperty(value = "")


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public Dataobject field1(String field1) {
    this.field1 = field1;
    return this;
  }

  /**
   * Get field1
   * @return field1
  */
  @ApiModelProperty(value = "")


  public String getField1() {
    return field1;
  }

  public void setField1(String field1) {
    this.field1 = field1;
  }

  public Dataobject field2(String field2) {
    this.field2 = field2;
    return this;
  }

  /**
   * Get field2
   * @return field2
  */
  @ApiModelProperty(value = "")


  public String getField2() {
    return field2;
  }

  public void setField2(String field2) {
    this.field2 = field2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dataobject dataobject = (Dataobject) o;
    return Objects.equals(this.action, dataobject.action) &&
        Objects.equals(this.field1, dataobject.field1) &&
        Objects.equals(this.field2, dataobject.field2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, field1, field2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dataobject {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    field1: ").append(toIndentedString(field1)).append("\n");
    sb.append("    field2: ").append(toIndentedString(field2)).append("\n");
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

