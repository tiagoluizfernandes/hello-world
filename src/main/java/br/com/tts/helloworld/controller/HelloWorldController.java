package br.com.tts.helloworld.controller;

import br.com.tts.helloworld.entity.HelloWorldEntity;
import br.com.tts.helloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author Tiago Luiz Fernandes
 */


@RestController
@RequestMapping("/api/v1/hello")
public class HelloWorldController {

    private final HelloWorldService  helloWorldService;

    @GetMapping()
    public List<HelloWorldEntity> findAll(){
        return Collections.emptyList();

    }

}
