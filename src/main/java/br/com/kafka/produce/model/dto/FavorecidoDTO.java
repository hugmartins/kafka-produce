package br.com.kafka.produce.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class FavorecidoDTO extends Cliente {

    @ApiModelProperty(value = "Nome cliente favorecido", example = "Fulano de tal")
    String nome;

    @ApiModelProperty(value = "Número agência", example = "1234")
    @NonNull
    String agencia;

    @ApiModelProperty(value = "Digito verificador agencia", example = "5")
    Integer digitoVerificadorAgencia;

    @ApiModelProperty(value = "Número conta", example = "000123")
    @NonNull
    String conta;

    @ApiModelProperty(value = "Digito verificador da conta", example = "4")
    Integer digitoVerificadorConta;

    @ApiModelProperty(value = "Código do banco", example = "080")
    @NonNull
    String banco;
}
