package br.com.kafka.produce.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class FavorecidoDTO extends Cliente{

    @ApiModelProperty(value = "Nome cliente favorecido")
    String nome;

    @ApiModelProperty(value = "Número agência")
    @NonNull
    Integer agencia;

    @ApiModelProperty(value = "Digito verificador agencia")
    Integer digitoVerificadorAgencia;

    @ApiModelProperty(value = "Número conta")
    @NonNull
    Integer conta;

    @ApiModelProperty(value = "Digito verificador da conta")
    Integer digitoVerificadorConta;

    @ApiModelProperty(value = "Código do banco", example = "080")
    @NonNull
    String banco;
    }
