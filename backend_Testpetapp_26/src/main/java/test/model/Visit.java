package test.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import test.model.Visit;
import test.model.Pet;
import test.model.PetOwner;
import test.model.VisitScheduler;
import test.model.Veterian;
import test.model.Appointment;
import test.model.VaccineScheduler;
import test.model.Image;
import test.converter.DurationConverter;
import test.converter.UUIDToByteConverter;
import test.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Visit")
@Table(name = "\"Visit\"", schema =  "\"testdb\"")
@Data
                        
public class Visit {
	public Visit () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Visit_id\"", nullable = true )
  private Integer visit_id;
	  
  @Column(name = "\"VetName\"", nullable = true )
  private String vetName;
  
	  
  @Column(name = "\"Prescription\"", nullable = true )
  private String prescription;
  
	  
  @Column(name = "\"Observations\"", nullable = true )
  private String observations;
  
	  
  @Column(name = "\"Pet_id\"", nullable = true )
  private Integer pet_id;
  
	  
  @Column(name = "\"PetName\"", nullable = true )
  private String petName;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Visit [" 
  + "Visit_id= " + visit_id  + ", " 
  + "VetName= " + vetName  + ", " 
  + "Prescription= " + prescription  + ", " 
  + "Observations= " + observations  + ", " 
  + "Pet_id= " + pet_id  + ", " 
  + "PetName= " + petName 
 + "]";
	}
	
}