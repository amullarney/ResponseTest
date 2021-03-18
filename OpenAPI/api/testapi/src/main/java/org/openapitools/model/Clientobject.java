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
 * Clientobject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-18T11:45:55.900914-07:00[America/Los_Angeles]")
public class Clientobject   {
  @JsonProperty("action")
  private String action;

  @JsonProperty("clientid")
  private String clientid;

  public Clientobject action(String action) {
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

  public Clientobject clientid(String clientid) {
    this.clientid = clientid;
    return this;
  }

  /**
   * Get clientid
   * @return clientid
  */
  @ApiModelProperty(value = "")


  public String getClientid() {
    return clientid;
  }

  public void setClientid(String clientid) {
    this.clientid = clientid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Clientobject clientobject = (Clientobject) o;
    return Objects.equals(this.action, clientobject.action) &&
        Objects.equals(this.clientid, clientobject.clientid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, clientid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clientobject {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    clientid: ").append(toIndentedString(clientid)).append("\n");
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

