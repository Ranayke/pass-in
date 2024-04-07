package rocketseat.com.passin.dto.event;

import lombok.Getter;
import lombok.Setter;
import rocketseat.com.passin.domain.event.EventEntity;

@Getter
@Setter
public class EventResponseDTO {
    EventDetailDTO event;

    public EventResponseDTO(EventEntity event, Integer numberOfAttendees) {
        this.event = new EventDetailDTO(
                event.getId(),
                event.getTitle(),
                event.getDetails(),
                event.getSlug(),
                event.getMaximumAttendees(),
                numberOfAttendees);
    }
}
