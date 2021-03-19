package br.com.kafka.produce.service.impl;

import br.com.kafka.produce.model.dto.ClientePesquisaDTO;
import br.com.kafka.produce.model.dto.FavorecidoDTO;
import br.com.kafka.produce.services.impl.PublicaMensagemCustomizadaServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.Collections;

import static org.mockito.ArgumentMatchers.anyString;

@RunWith(MockitoJUnitRunner.class)
public class PublicaMensagemCustomizadaServiceImplTest {

    @InjectMocks
    private PublicaMensagemCustomizadaServiceImpl target;

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String TOPIC_NAME = "topiTest";

    @Before
    public void setUp(){
        ReflectionTestUtils.setField(target, "topicName", TOPIC_NAME);
    }

    @Test
    public void testePublicarMensagemDtoNull(){
        target.publicarMensagem(null);
        Mockito.verify(kafkaTemplate,Mockito.times(0)).send(anyString(),anyString(),anyString());
    }

    @Test
    public void testePublicarMensagemDto(){
        final String MOCK_CPF = "MOCK";

        FavorecidoDTO favorecidoDTO = new FavorecidoDTO();

        ClientePesquisaDTO dto = new ClientePesquisaDTO();
        dto.setCpfCnpj(MOCK_CPF);
        dto.setListaFavorecidos(Collections.singletonList(favorecidoDTO));

        target.publicarMensagem(dto);
        Mockito.verify(kafkaTemplate,Mockito.times(1)).send(TOPIC_NAME,MOCK_CPF,favorecidoDTO.toString());
    }
}
