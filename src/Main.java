
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args){
        Greetings greetings = new Greetings();

        Method[] methods = greetings.getClass().getDeclaredMethods();

        for (Method method: methods) {
            System.out.println(method.getAnnotation(DevAnnotation.class));
        }


    }
}