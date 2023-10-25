package lt.daujotas.Uzduotis1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Payment {

    public static void main(String[] args) throws IOException {

        final Sender sendPayment = new Sender("Jonas", "Jonaitis", 36);
        final Receiver receivePaiment = new Receiver("Kestas", "Kestutis", 65);
        File paymentInfoFile = new File("paiment.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(paymentInfoFile, sendPayment);
        final Sender senderDeserialisation = objectMapper.readValue(paymentInfoFile, Sender.class);
        System.out.println(senderDeserialisation);
    }
}
