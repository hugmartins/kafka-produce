package br.com.kafka.produce.services;

import br.com.kafka.produce.model.dto.ClienteInputDTO;

public interface PublicaMensagemCustomizadaService {
    void publicarMensagem(ClienteInputDTO dto);
}
