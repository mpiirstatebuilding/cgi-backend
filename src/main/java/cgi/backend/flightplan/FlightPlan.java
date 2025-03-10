package cgi.backend.flightplan;

import cgi.backend.seats.Seat;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FlightPlan {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Integer flightId;

  private String destination;

  private LocalDate date;

  private LocalTime startTime;

  private LocalTime endTime;

  @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Seat> seats;

}
