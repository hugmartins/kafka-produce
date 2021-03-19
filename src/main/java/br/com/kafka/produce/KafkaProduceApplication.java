package br.com.kafka.produce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = "br.com.kafka.produce")
@EnableScheduling
@EnableKafka
public class KafkaProduceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProduceApplication.class, args);
	}
}
