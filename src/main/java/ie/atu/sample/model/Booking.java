package ie.atu.sample.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long attendeeCount;
    private String organiserName;
    private String bookingStatus = "ACTIVE";
    private String associatedRoom;


    @ManyToOne
    @JoinColumn(name = "room_id");
    private Room room;

}
