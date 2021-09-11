package structuralPatterns.facade;

public class Facade {
    private Decode decodeFile = new Decode();
    private Encode encodeFile = new Encode();
    private File file = new File();

    public String encode(){
        System.out.println("Введите данные: ");
        file.write();
        return encodeFile.encode(file.getMessage());
    }

    public void decode(String encodeMessage){
        decodeFile.decode(encodeMessage);
    }
}
