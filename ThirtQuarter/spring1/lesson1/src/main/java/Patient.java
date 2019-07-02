import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

public class Patient {
    public static void main(String[] args) {

        //0. Балоовня с классом Registry
//        Registry registry = new Registry();
//        ChildHospital childHospital = registry.getHospital();
//        childHospital.doRedirect();

        //1. *.xml implementation
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Hospital childHospitalXML = context.getBean("childHospital", Hospital.class);
        childHospitalXML.doRedirect();

        //2. AppConfig implementation
        ApplicationContext contextAppConfig = new AnnotationConfigApplicationContext(AppConfig.class);
        Hospital childHospitalAppConfig = contextAppConfig.getBean("childHospital", Hospital.class);
        childHospitalAppConfig.doRedirect();

        //3. Autowired implementation
        ApplicationContext contextAutowired = new AnnotationConfigApplicationContext(AppConfig.class);
        Hospital childHospitalAutowired = contextAutowired.getBean("childHospitalAnnotation", Hospital.class);
        childHospitalAutowired.doRedirect();

    }
}
