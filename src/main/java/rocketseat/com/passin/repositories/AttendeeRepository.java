package rocketseat.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.attendee.AttendeeEntity;

import java.util.List;

public interface AttendeeRepository extends JpaRepository<AttendeeEntity, String> {
    List<AttendeeEntity> findByEventId(String eventId);
}
