package pl.pjatk.tombaj.component;


import org.springframework.stereotype.Component;
import pl.pjatk.tombaj.rest.MySimpleClass;

@Component
public class MyThridComponent {
//    public MyThridComponent(ApplicationContext applicationContext) {
//        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
//        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
//        System.out.println("MyThridComponent");
//    }
//    public MyThridComponent(MyFirstComponent myFirstComponent, MySecondComponent mySecondComponent ) { //to to samo
//        System.out.println("MyThridComponent");
//    }

    public MyThridComponent(MyFirstComponent myFirstComponent,
                            MySecondComponent mySecondComponent,
                            MySimpleClass mySimpleClass,
                            MySimpleClass mySecondSimpleClass) {
        //mySecondComponent
        System.out.println("Hello from MyThfidComponent");
        System.out.println(mySimpleClass.getName());
        System.out.println(mySecondSimpleClass.getName());
    }
}
