package cgi.backend.flightplan;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FlightPlanService {
  private final FlightPlanRepository flightPlanRepository;

}
