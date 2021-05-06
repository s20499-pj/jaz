package pl.pjatk.tombaj.component;

import org.springframework.stereotype.Component;
import pl.pjatk.tombaj.rest.MySimplePojo;

import java.util.List;

@Component
public class MyFirstComponent {

    public MyFirstComponent(MySimplePojo mySimplePojo,
                            List<String> defaultData,
                            List<MySimplePojo> mySimplePojoList) {
        System.out.println("MyFirstComponent");
        System.out.println(mySimplePojo.geta());
        System.out.println(defaultData);
        System.out.println(mySimplePojoList);
    }
}