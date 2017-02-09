/*
 * Copyright PT. Swamedia Informatika
 */
package id.muhamadridwan.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Muhamad Ridwan  <muhamadridwan.info@gmail.com>
 */
@RestController
public class Controller {
    
    @GetMapping("/")
    public Status index(){
        Status status = new Status();
        status.setKode("200");
        status.setPesan("Hello Wolrd!");
        
        return status;
    }
    
}
