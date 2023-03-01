package br.com.tts.helloworld.controller;

import br.com.tts.helloworld.entity.HelloWorldHubEntity;
import br.com.tts.helloworld.service.HelloWorldHubService;
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
public class HelloWorldHubController {

    private final HelloWorldHubService helloWorldService;

    @GetMapping()
    public List<HelloWorldHubEntity> findAll(){
        return helloWorldService.findAll();

    }

}
