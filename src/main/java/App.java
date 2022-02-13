import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    static boolean getBool(Object o1, Object o2) {
    boolean op;
    if (o1 == o2) op = true;
    else op = false;
    return op;
}
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean.getMessage()+getBool(bean, bean2));

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println(cat.getMessage() + getBool(cat, cat2));
    }
}