/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Containerobject;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-18T11:45:55.900914-07:00[America/Los_Angeles]")
@Validated
@Api(value = "queryobj", description = "the queryobj API")
public interface QueryobjApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /queryobj
     * try data
     *
     * @param containerobject  (optional)
     * @return success (status code 200)
     *         or Invalid request (status code 400)
     */
    @ApiOperation(value = "", nickname = "postQueryObj", notes = "try data", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "success", response = String.class),
        @ApiResponse(code = 400, message = "Invalid request") })
    @PostMapping(
        value = "/queryobj",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> postQueryObj(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Containerobject containerobject) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}