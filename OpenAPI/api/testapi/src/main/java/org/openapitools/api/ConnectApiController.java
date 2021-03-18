package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-16T09:53:24.192386-07:00[America/Los_Angeles]")
@Controller
@RequestMapping("${openapi.gizmo.base-path:}")
public class ConnectApiController implements ConnectApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ConnectApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    
    @Override
    public ResponseEntity<String> registerClient() {
        System.out.printf( "Connect - register client\n" );
        return ResponseEntity.ok("Connected");

    }
    

}
