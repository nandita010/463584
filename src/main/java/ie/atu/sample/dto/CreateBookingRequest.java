package ie.atu.sample.dto;

public record CreateBookingRequest
        (long attendeeCount,
         String organiserName,
         String bookingStatus,
         String associatedRoom) {

}
