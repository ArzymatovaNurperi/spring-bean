package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean1=
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat cat1=
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getCatSound());

        Cat cat2=
                (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getCatSound());

        System.out.println(bean==bean1);
        System.out.println(cat1==cat2);
    }
}
