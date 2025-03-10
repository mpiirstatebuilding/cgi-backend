package cgi.backend.seats;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SeatService {
  private final SeatRepository seatRepository;
}
