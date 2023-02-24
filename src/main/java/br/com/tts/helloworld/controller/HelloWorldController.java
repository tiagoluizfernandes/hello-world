package br.com.tts.helloworld.controller;

import br.com.tts.helloworld.entity.HelloWorldEntity;
import br.com.tts.helloworld.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tiago Luiz Fernandes
 */


@RestController
@RequestMapping("/api/v1/hello")
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloWorldService  helloWorldService;

    @GetMapping()
    public List<HelloWorldEntity> findAll(){
        return helloWorldService.findAll();

    }

}
