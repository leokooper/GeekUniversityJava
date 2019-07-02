/**
 * @author Igor Leonchenko
 * @version 1.0
 */

public class Registry {
    public ChildHospital getHospital(){
        ChildHospital childHospital = new ChildHospital();
        Doctorable doctor = new Pediatrician();
        childHospital.setDoctor(doctor);
        return childHospital;
    }
}
