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

@Entity(name = "PetOwnerPetOwnerImage")
@Table(schema = "\"testdb\"", name = "\"PetOwnerPetOwnerImage\"")
@Data
public class PetOwnerPetOwnerImage{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"Pet_ownerId\"")
	private Integer pet_ownerId;

    
    @Column(name = "\"ImageId\"")
    private Integer imageId;
 
}