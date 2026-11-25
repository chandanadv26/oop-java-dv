import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String msg) {
        super(msg);
    }
}

class Reservation {
    boolean[] seats = new boolean[5];

    void reserveSeat(int seat) throws Exception {

        if (seat < 1 || seat > 5) {
            throw new IllegalArgumentException("Invalid seat number!");
        }

        if (seats[seat - 1]) {
            throw new SeatAlreadyBookedException("Seat already booked!");
        }

        seats[seat - 1] = true;
        System.out.println("Seat reserved successfully!");
    }
}

class RailwayReservation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reservation r = new Reservation();

        try {
            System.out.print("Enter seat number (1-5): ");
            int seat = sc.nextInt();

            r.reserveSeat(seat);
        }

        catch (SeatAlreadyBookedException e) {
            System.out.println(e.getMessage());
        }

        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        catch (java.util.InputMismatchException e) {
            System.out.println("Incorrect input! Enter a number.");
        }

        catch (Exception e) {
            System.out.println("Error occurred.");
        }

        finally {
            System.out.println("Transaction completed.");
        }

        sc.close();
    }
}

