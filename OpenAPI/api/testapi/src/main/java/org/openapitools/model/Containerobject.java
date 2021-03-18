package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Clientdata;
import org.openapitools.model.Dataobject;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Containerobject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-18T11:45:55.900914-07:00[America/Los_Angeles]")
public class Containerobject   {
  @JsonProperty("data")
  private Dataobject data;

  @JsonProperty("client")
  private Clientdata client;

  public Containerobject data(Dataobject data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(value = "")

  @Valid

  public Dataobject getData() {
    return data;
  }

  public void setData(Dataobject data) {
    this.data = data;
  }

  public Containerobject client(Clientdata client) {
    this.client = client;
    return this;
  }

  /**
   * Get client
   * @return client
  */
  @ApiModelProperty(value = "")

  @Valid

  public Clientdata getClient() {
    return client;
  }

  public void setClient(Clientdata client) {
    this.client = client;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Containerobject containerobject = (Containerobject) o;
    return Objects.equals(this.data, containerobject.data) &&
        Objects.equals(this.client, containerobject.client);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, client);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Containerobject {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
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

