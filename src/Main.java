
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args){
        Greetings greetings = new Greetings();

        Method[] methods = greetings.getClass().getDeclaredMethods();

        for (Method method: methods) {
          String devName = method.getAnnotation(DevAnnotation.class).DevName();
          String devSurname = method.getAnnotation(DevAnnotation.class).DevSurname();
          System.out.printf("The method is '%s', written by %s %s %n", method.getName(), devName, devSurname);

        }


    }
}