package br.com.tts.helloworld.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tiago Luiz Fernandes
 */

@Builder
@Data
public class HelloWorldEntity {
    private Long id;
    private String description;
}
