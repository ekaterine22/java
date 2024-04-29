
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Rental Company that manages a fleet of scooters.
 */
public class RentalCompany {

    private int uid = 0;
    private List<Scooter> scooters = new ArrayList<>();

    /**
     * Returns a list of available scooters in the company's fleet.
     *
     * @return List of available scooters.
     */
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter : scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    /**
     * Adds a new scooter to the company's fleet.
     *
     * @param scooter The scooter to add.
     */
    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    /**
     * Removes a scooter from the company's fleet based on its ID.
     *
     * @param id The ID of the scooter to remove.
     * @return True if the scooter was successfully removed, false otherwise.
     */
    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
            }
        }
        return removed;
    }

    /**
     * Rents a scooter from the company's fleet based on its ID.
     *
     * @param id The ID of the scooter to rent.
     */
    public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                scooter.setAvailable(false); // Mark scooter as rented
                break;
            }
        }
    }

    /**
     * Returns a rented scooter to the company's fleet based on its ID and location.
     *
     * @param id The ID of the scooter to return.
     * @param x  The X-coordinate of the return location.
     * @param y  The Y-coordinate of the return location.
     */
    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && !scooter.isAvailable()) {
                scooter.setAvailable(true); // Mark scooter as available
                scooter.setX(x); // Update scooter's location
                scooter.setY(y);
                break;
            }
        }
    }

    /**
     * Displays information about all scooters in the company's fleet.
     */
    public void displayAllScooters() {
        for (Scooter scooter : scooters) {
            System.out.println(scooter.toString());
        }
    }
}
