package org.openapitools.api;

import org.openapitools.api.GetclientApiController;
import org.openapitools.model.Clientobject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-16T09:53:24.192386-07:00[America/Los_Angeles]")
@Controller
@RequestMapping("${openapi.gizmo.base-path:}")
public class QueryfirstApiController implements QueryfirstApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public QueryfirstApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    
    @Override
    public ResponseEntity<String> queryOne() {
        Clientobject lastclient = GetclientApiController.GetLastClient();
        System.out.printf( "Queryfirst\n" );
        if ( null != lastclient ) {
            String theclient = lastclient.getClientid();
            System.out.printf("Last getclient id was: %s\n", theclient );
            Notify( theclient );
        }
        return ResponseEntity.ok("Http auto-response to queryfirst");

    }
    
    public void Notify ( String clientid ) {
    
            String msg = "Unsolicited message to " + clientid;
            System.out.printf("Attempting to send to %s\n", clientid );
    
            HttpURLConnection connection = null;
            try {
                URL url = new URL( "https://7e72r4qxx6.execute-api.us-west-1.amazonaws.com/test/@connections/" + clientid );
                connection = (HttpURLConnection) url.openConnection();
                int resp = connection.getResponseCode();
                System.out.printf("Open connection response code = %s\n", resp );
                if (resp != 200) {
                    System.out.printf("Bad response - giving up\n");
                    if (connection != null)
                        connection.disconnect();
                    return;
                }
                connection.setDoOutput(true);
                connection.setRequestMethod("POST");
                connection.setRequestProperty("content-type", "text/plain; charset=utf-8");
                try (DataOutputStream out = new DataOutputStream(connection.getOutputStream())) {
                    out.write(msg.getBytes());
                }
                resp = connection.getResponseCode();
                System.out.printf("Send attempt response code = %s\n", resp );
            } catch (IOException e) {
                 System.out.printf( "Http send failed: %s\n", e.toString() );
            }
            if (connection != null) {
                connection.disconnect();
            }
    }
}

