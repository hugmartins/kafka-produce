package br.com.kafka.produce.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientePesquisaDTO extends Cliente{

    @ApiModelProperty(value = "Lista de todos favorecidos vinculados ao cliente")
    private List<FavorecidoDTO> listaFavorecidos;
}
