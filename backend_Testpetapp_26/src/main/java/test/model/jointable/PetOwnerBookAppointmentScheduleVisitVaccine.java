package test.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import test.model.Visit;
import test.model.Pet;
import test.model.PetOwner;
import test.model.VisitScheduler;
import test.model.Veterian;
import test.model.Appointment;
import test.model.VaccineScheduler;
import test.model.Image;

@Entity(name = "PetOwnerBookAppointmentScheduleVisitVaccine")
@Table(schema = "\"testdb\"", name = "\"PetOwnerBookAppointmentScheduleVisitVaccine\"")
@Data
public class PetOwnerBookAppointmentScheduleVisitVaccine{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Pet_ownerId\"")
	private Integer pet_ownerId;

    
    @Column(name = "\"Vet_id\"")
    private Integer vet_id;
 
}