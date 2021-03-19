package br.com.kafka.produce.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Cliente {

    @ApiModelProperty(value = "CPF ou CNPJ do cliente")
    private String cpfCnpj;
}
