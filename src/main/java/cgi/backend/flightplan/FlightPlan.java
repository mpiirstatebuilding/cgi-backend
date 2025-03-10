package cgi.backend.flightplan;

import cgi.backend.seats.Seat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.sql.Time;
import java.util.Date;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FlightPlan {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Integer id;
  private String destination;
  private Date date;
  private Time startTime;
  private Time endTime;
  @OneToMany
  private Set<Seat> seats;

}
