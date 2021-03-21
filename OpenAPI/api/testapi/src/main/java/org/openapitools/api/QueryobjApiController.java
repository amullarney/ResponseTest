package org.openapitools.api;

import org.openapitools.model.Containerobject;
import org.openapitools.model.Clientdata;
import org.openapitools.model.Dataobject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-18T11:45:55.900914-07:00[America/Los_Angeles]")
@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class QueryobjApiController implements QueryobjApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public QueryobjApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    public ResponseEntity<String> postQueryObj(Containerobject containerobject) {
        Dataobject dataobject = containerobject.getData();
        Clientdata client = containerobject.getClient();
        System.out.printf( "Data received\n" );
        if ( dataobject != null ) {
          System.out.printf( "action %s\n" , dataobject.getAction() );
          System.out.printf( "field1 %s\n" , dataobject.getField1() );
          System.out.printf( "field2 %s\n" , dataobject.getField2() );
        }
        if ( client != null )
          return ResponseEntity.ok("Data received from client: " + client.getClientid() );
        else
          return ResponseEntity.ok("Data failed\n" );
    }
}
