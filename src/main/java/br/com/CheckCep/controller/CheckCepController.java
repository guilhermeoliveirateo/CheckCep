package br.com.CheckCep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.CheckCep.domain.CheckCepDomain;

@RestController
@RequestMapping("/api/cep")

public class CheckCepController {

    @GetMapping("/{cep}")
    
    public CheckCepDomain checkCep(@PathVariable("cep") String cep) {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<CheckCepDomain> resp = restTemplate.getForEntity(
            String.format("https://viacep.com.br/ws/%s/json/", cep),
            CheckCepDomain.class);

            return resp.getBody();
    }
}