package org.openapitools.api;

import org.openapitools.model.Clientobject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-18T07:34:30.071486-07:00[America/Los_Angeles]")
@Controller
@RequestMapping("${openapi.sample.base-path:}")
public class GetclientApiController implements GetclientApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GetclientApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    public ResponseEntity<String> getClient( Clientobject clientobject) {
        if ( null != clientobject )
           System.out.printf("Client is %s\n", clientobject.getClientid() );
        else
           System.out.printf("Sorry - nobody home\n" );
        return ResponseEntity.ok("Connected client is: " + clientobject.getClientid() );

    }
}
