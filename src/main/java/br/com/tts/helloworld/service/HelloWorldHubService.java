package br.com.tts.helloworld.service;

import br.com.tts.helloworld.entity.HelloWorldHubEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tiago Luiz Fernandes
 */

@Service
public class HelloWorldHubService {

    public List<HelloWorldHubEntity> findAll() {
        List<HelloWorldHubEntity> helloWorldEntityList = new ArrayList<>();

        helloWorldEntityList.add(HelloWorldHubEntity.builder().id(1L).description("Description 1").build());
        helloWorldEntityList.add(HelloWorldHubEntity.builder().id(2L).description("Description 2").build());
        helloWorldEntityList.add(HelloWorldHubEntity.builder().id(3L).description("Description 3").build());

        return helloWorldEntityList;
    }

}
