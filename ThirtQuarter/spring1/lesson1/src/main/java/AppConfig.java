import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

@Configuration
public class AppConfig {
    @Bean(name = "surgeon")
    public Doctorable doctorable(){
        return new Surgeon();
    }

    @Bean(name = "childHospital")
    public Hospital hospital (Doctorable doctor) {
        ChildHospital hospital = new ChildHospital();
        hospital.setDoctor(doctor);
        return hospital;
    }

    @Bean(name = "childHospitalAnnotation")
    public Hospital hospital1 (Doctorable doctor) {
        ChildHospital hospital1 = new ChildHospital();
        hospital1.setDoctor(doctor);
        return hospital1;
    }

}

