package cgi.backend.seats;

import cgi.backend.flightplan.FlightPlan;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Integer seatId;

  private Boolean nextToWindow;

  private Boolean moreLegSpace;

  private Boolean closeToExit;

  @ManyToMany
  @JoinTable(
      name = "adjacent_seats",
      joinColumns = @JoinColumn(name = "seat_id"),
      inverseJoinColumns = @JoinColumn(name = "adjacent_seat_id")
  )
  private Set<Seat> adjacentSeats;

  @ManyToOne
  @JoinColumn(name = "flight_id", nullable = false)
  private FlightPlan flight;

}
