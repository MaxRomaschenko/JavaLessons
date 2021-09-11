package debuger;

public class Second {
    public void func2(){
        System.out.println("привет");
        privateFunc();
    }

    private void privateFunc(){
        System.out.println("Пока");
    }
}
