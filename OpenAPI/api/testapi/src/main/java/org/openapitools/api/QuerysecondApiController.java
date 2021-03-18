package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-16T09:53:24.192386-07:00[America/Los_Angeles]")
@Controller
@RequestMapping("${openapi.gizmo.base-path:}")
public class QuerysecondApiController implements QuerysecondApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public QuerysecondApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    public ResponseEntity<String> queryTwo( String question) {
        System.out.printf( "Querysecond - path parameter %s\n", question );
        return ResponseEntity.ok("Responding to querysecond with " + question + "- http");
   }
}
