package model.entities;
import model.exceptions.DomainException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Reservation {
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
        if (checkOut.isBefore(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public int duration(){
        return checkOut.compareTo(checkIn);

    }
    public void updateDates(LocalDate checkIn, LocalDate checkOut){
        LocalDate now = LocalDate.now();

        if(!checkIn.isAfter(now) || !checkOut.isAfter(now)){
            throw new DomainException("Reservation dates for update must be future dates");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + formatter.format(checkIn)
                + ", check-out: "
                + formatter.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }
}
