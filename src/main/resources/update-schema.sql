CREATE TABLE adjacent_seats
(
    adjacent_seat_id INTEGER NOT NULL,
    seat_id          INTEGER NOT NULL,
    CONSTRAINT pk_adjacent_seats PRIMARY KEY (adjacent_seat_id, seat_id)
);

CREATE TABLE flight_plan
(
    flight_id   INTEGER NOT NULL,
    destination VARCHAR(255),
    date        date,
    start_time  time WITHOUT TIME ZONE,
    end_time    time WITHOUT TIME ZONE,
    CONSTRAINT pk_flightplan PRIMARY KEY (flight_id)
);

CREATE TABLE seat
(
    seat_id        INTEGER NOT NULL,
    next_to_window BOOLEAN,
    more_leg_space BOOLEAN,
    close_to_exit  BOOLEAN,
    flight_id      INTEGER NOT NULL,
    CONSTRAINT pk_seat PRIMARY KEY (seat_id)
);

ALTER TABLE seat
    ADD CONSTRAINT FK_SEAT_ON_FLIGHT FOREIGN KEY (flight_id) REFERENCES flight_plan (flight_id);

ALTER TABLE adjacent_seats
    ADD CONSTRAINT fk_adjsea_on_adjacent_seat FOREIGN KEY (adjacent_seat_id) REFERENCES seat (seat_id);

ALTER TABLE adjacent_seats
    ADD CONSTRAINT fk_adjsea_on_seat FOREIGN KEY (seat_id) REFERENCES seat (seat_id);