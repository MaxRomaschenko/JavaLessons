package errors;

public class Error {
    private ClassError classError;

    public void func2(){
        try {
            classError.func();
        }catch (RuntimeException runtimeException){
            System.err.println("Runtime ex");
            runtimeException.printStackTrace();
        }catch (Exception exception){
            System.err.println("Exception");
            exception.printStackTrace();
        }finally {
            System.out.println("всё равно работаю");
        }
    }
}
