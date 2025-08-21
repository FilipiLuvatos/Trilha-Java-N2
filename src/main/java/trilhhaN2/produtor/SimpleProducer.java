package trilhhaN2.produtor;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Random;

public class SimpleProducer {
    public static void main(String[] args) {
        Properties props = new Properties();
        Random random = new Random();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        try (KafkaProducer<String, String> producer = new KafkaProducer<>(props)) {
            for (int i = 0; i < 5; i++) {
                int numeroAleatorio = random.nextInt(100000);
                String message = "Mensagem número " + numeroAleatorio;
                producer.send(new ProducerRecord<>("meu-topico", message));
                System.out.println("Enviado: " + message);
            }
        }
    }
}
