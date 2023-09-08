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

@Entity(name = "VisitSchedulerVisitSchedular")
@Table(schema = "\"testdb\"", name = "\"VisitSchedulerVisitSchedular\"")
@Data
public class VisitSchedulerVisitSchedular{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Visit_id\"")
	private Integer visit_id;

    
    @Column(name = "\"Vet_id\"")
    private Integer vet_id;
 
}