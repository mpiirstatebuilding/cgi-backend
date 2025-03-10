package cgi.backend.seats;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Integer id;
  private Boolean nextToWindow;
  private Boolean moreLegSpace;
  private Boolean closeToExit;
  @OneToMany
  private Set<Seat> adjacentSeats;

}
