package br.com.kafka.produce.services.impl;

import br.com.kafka.produce.model.dto.ClientePesquisaDTO;
import br.com.kafka.produce.services.PublicaMensagemCustomizadaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.Objects;

@Service
public class PublicaMensagemCustomizadaServiceImpl implements PublicaMensagemCustomizadaService {

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Value(value = "${kafka.topic}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void publicarMensagem(ClientePesquisaDTO dto) {
        if (Objects.isNull(dto) || CollectionUtils.isEmpty(dto.getListaFavorecidos()))
            return;
        try {
            LOGGER.info("Enviando mensagem para Kafka");

            dto.getListaFavorecidos().forEach(favorecido ->
                    kafkaTemplate.send(topicName, dto.getCpfCnpj(), favorecido.toString())
            );

            LOGGER.info("Mensagem enviada");
        } catch (Exception ex) {
            LOGGER.error("Fala no envio da mensagem: {}", ex.getMessage());
        }
    }
}
