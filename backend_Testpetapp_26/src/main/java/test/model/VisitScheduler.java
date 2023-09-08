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

@Entity(name = "VisitScheduler")
@Table(name = "\"VisitScheduler\"", schema =  "\"testdb\"")
@Data
                        
public class VisitScheduler {
	public VisitScheduler () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"Visit_id\"", nullable = true )
  private Integer visit_id;
	  
  @Column(name = "\"ScheduleVisitfrom\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date scheduleVisitfrom;  
  
	  
  @Column(name = "\"ScheduleVisitto\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date scheduleVisitto;  
  
	  
  @Column(name = "\"AlertPhonenum\"", nullable = true )
  private Long alertPhonenum;
  
	  
  @Column(name = "\"VisitRecurrence\"", nullable = true )
  private Integer visitRecurrence;
  
	  
  @Column(name = "\"VisitRecurrenceType\"", nullable = true )
  private String visitRecurrenceType;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"VisitSchedulerPetVisit\"",
            joinColumns = @JoinColumn( name="\"Visit_id\""),
            inverseJoinColumns = @JoinColumn( name="\"Pet_id\""), schema = "\"testdb\"")
private List<Pet> petVisit = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"VisitSchedulerPetVaccineSchedular\"",
            joinColumns = @JoinColumn( name="\"Visit_id\""),
            inverseJoinColumns = @JoinColumn( name="\"Visit_id\""), schema = "\"testdb\"")
private List<Visit> petVaccineSchedular = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"VisitSchedulerVisitSchedular\"",
            joinColumns = @JoinColumn( name="\"Visit_id\""),
            inverseJoinColumns = @JoinColumn( name="\"Vet_id\""), schema = "\"testdb\"")
private List<Veterian> visitSchedular = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"VisitSchedulerVetPetVisitSchedular\"",
            joinColumns = @JoinColumn( name="\"Visit_id\""),
            inverseJoinColumns = @JoinColumn( name="\"Pet_ownerId\""), schema = "\"testdb\"")
private List<PetOwner> vetPetVisitSchedular = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "VisitScheduler [" 
  + "Visit_id= " + visit_id  + ", " 
  + "ScheduleVisitfrom= " + scheduleVisitfrom  + ", " 
  + "ScheduleVisitto= " + scheduleVisitto  + ", " 
  + "AlertPhonenum= " + alertPhonenum  + ", " 
  + "VisitRecurrence= " + visitRecurrence  + ", " 
  + "VisitRecurrenceType= " + visitRecurrenceType 
 + "]";
	}
	
}