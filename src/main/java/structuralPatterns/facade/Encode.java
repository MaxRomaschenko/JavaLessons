package structuralPatterns.facade;

import java.util.Base64;

public class Encode {

    private String encodeMessage;

    public String getEncodeMessage() {
        return encodeMessage;
    }

    public String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        encodeMessage = Base64.getEncoder().encodeToString(result);
        System.out.println("Encoded message: " + encodeMessage);
        return encodeMessage;
    }
}
