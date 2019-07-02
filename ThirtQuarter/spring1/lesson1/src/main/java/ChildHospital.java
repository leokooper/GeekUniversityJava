import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Igor Leonchenko
 * @version 1.0
 */

@Component("childHospital")
public class ChildHospital implements Hospital{

    private Doctorable doctor;

    public Doctorable getDoctor() {
        return doctor;
    }

    @Autowired(required = false)
    public void setDoctor(Doctorable doctor) {
        this.doctor = doctor;
    }

    public void doRedirect() {
        System.out.println("Вас будет лечить следующий доктор:");
        doctor.typeDoctor();
    }
}
