package cgi.backend.flightplan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightPlanRepository extends JpaRepository<FlightPlan, Long> {

}
