package ie.atu.sample.service;

import ie.atu.sample.dto.CreateBookingRequest;
import ie.atu.sample.model.Booking;
import ie.atu.sample.model.Room;
import ie.atu.sample.repository.BookingRepository;
import ie.atu.sample.repository.RoomRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepository;
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }
    private final RoomRepository roomRepository;
    public RoomRepository getRoomRepository() {
        this.roomRepository = roomRepository
    }

    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    public Room create(CreateBookingRequest request) {
    if (request.attendeeCount() == null) {
        throw new IllegalArgumentException("Attendee count is null");
        }
    Booking booking = BookingRepository;
    .findById(request.attendeeCount())
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Booking does not exist"));
    booking.setAttendeeCount(request.attendeeCount());
    booking.setBookingStatus(request.bookingStatus());
    booking.setAssociatedRoom(request.associatedRoom());
    booking.setOrganiserName(request.organiserName());
}
