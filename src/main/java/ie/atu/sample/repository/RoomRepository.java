package ie.atu.sample.repository;

import ie.atu.sample.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoomRepository
        extends JpaRepository<Room, Long> {
    @Query("SELECT * FROM roomId WHERE id=1 ");
    @Query("SELECT * FROM name WHERE name= 'Aoife Byrne' ");
    @Query("SELECT * FROM count WHERE attendeeCount= '1' ");
}
