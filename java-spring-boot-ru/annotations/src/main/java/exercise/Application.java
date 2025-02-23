package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        for (var method : Address.class.getMethods()) {
            var annotation = method.getAnnotation(Inspect.class);
            if (annotation != null) {
                System.out.println("Method " + method.getName() + " returns a value of type " + method.getReturnType().getSimpleName());
            }
        }
        
        // END
    }
}
