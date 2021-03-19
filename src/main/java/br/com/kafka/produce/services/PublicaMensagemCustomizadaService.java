package br.com.kafka.produce.services;

import br.com.kafka.produce.model.dto.ClientePesquisaDTO;

public interface PublicaMensagemCustomizadaService {
    void publicarMensagem(ClientePesquisaDTO dto);
}
