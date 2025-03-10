package cgi.backend.flightplan;

import java.sql.Time;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlightPlan {

  private String id;
  private String destination;
  private Date date;
  private Time startTime;
  private Time endTime;

}
