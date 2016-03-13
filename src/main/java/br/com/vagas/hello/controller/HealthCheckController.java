package br.com.vagas.hello.controller;

import br.com.vagas.hello.domain.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author luisrpp
 */
@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @RequestMapping(value = "/status", method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseMessage status() {
        return new ResponseMessage("I'm OK!");
    }
}
