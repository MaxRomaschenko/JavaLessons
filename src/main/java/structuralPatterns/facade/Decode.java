package structuralPatterns.facade;

import java.util.Base64;

public class Decode {

    private String decodeMessage;

    public String getDecodeMessage() {
        return decodeMessage;
    }

    public void decode(String encodeMessage) {
        byte[] result = Base64.getDecoder().decode(encodeMessage);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        decodeMessage = new String(result);
        System.out.println("Decoded message: " + decodeMessage);
    }
}
