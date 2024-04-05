package rocketseat.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.attendee.AttendeeEntity;

public interface AttendeeRepository extends JpaRepository<AttendeeEntity, String> {
}
