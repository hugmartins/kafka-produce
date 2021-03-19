package br.com.kafka.produce.controllers;

import br.com.kafka.produce.model.dto.ClienteInputDTO;
import br.com.kafka.produce.services.PublicaMensagemCustomizadaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/produces")
public class RestServiceController {

    @Autowired
    private PublicaMensagemCustomizadaService service;

    @ApiOperation(value = "Enviar dados para Kafka")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Dados enviados com sucesso."),
            @ApiResponse(code = 500, message = "Erro ao tentar enviar mensagem."),
    })
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> pushMessage(
            @ApiParam(name = "dtoEntrada", value = "Dados de favorecidos por cliente", required = true) @RequestBody ClienteInputDTO dtoEntrada){
        service.publicarMensagem(dtoEntrada);
        return ResponseEntity.ok("ok");
    }
}
