package rocketseat.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.attendee.AttendeeEntity;

import java.util.List;
import java.util.Optional;

public interface AttendeeRepository extends JpaRepository<AttendeeEntity, String> {
    List<AttendeeEntity> findByEventId(String eventId);

    Optional<AttendeeEntity> findByEventIdAndEmail(String eventId, String email);
}