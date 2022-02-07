/**
 * * This class represents a usedCarLot object
 *
 * @author Chanul Dandeniya
 */

import java.util.ArrayList;

public class UsedCarLot {
    /** List to store all Car info */
    private ArrayList<Car> inventory;

    /**
     * Instantiates a usedCarLot object.
     */
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    /**
     * Gets the inventory of all values added ot the list.
     *
     * @return inventory list
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    /**
     * Adds new Car and relative information to inventory
     */
    public void addCar(Car car) {
        inventory.add(car);
    }

    /**
     * Switches placement of two values given two indexes.
     * <p>
     * If both values are greater than 0.
     * Finds index of first value and sets to temp;
     * Sets value at index first to the value at index second
     * Sets value at inde second to temp
     *
     * @param first is one of the values index you want to switch
     * @param second is one of the values index you want to switch
     * @return true if everything was executed, false if not
     */
    public boolean swap(int first, int second){

        if (first >= 0 && second >= 0) {
            if (first < inventory.size() && second < inventory.size()) {
                Car temp = getInventory().get(first);
                inventory.set(first, getInventory().get(second));
                inventory.set(second, temp);
                return true;
            }
        }
        return false;
    }

    /**
     * Adds a Car to inventory at the given index
     * <p>
     * PRECONDITION: indexToAdd is within range of list
     *
     * @param indexToAdd where to add the given Car value
     * @param carToAdd Car value to add
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * Sells car and removes from the inventory list
     * <p>
     * PRECONDITION: indexOfCarToSell is less than size of inventory
     *
     * @param indexOfCarToSell index of what value to remove
     * @return value removed
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /**
     * Sells car and replaces value with null
     * <p>
     * PRECONDITION: indexOfCarToSell is less than size of inventory
     *
     * @param indexOfCarToSell index of what value to remove
     * @return sold car with updated value of null
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car soldCar = inventory.set(indexOfCarToSell, null);
        return soldCar;
    }
    /**
     * Moves car and and shifts array based off of new position
     * <p>
     * PRECONDITION: indexOfCarToMove and destinationIndex is less than size of inventory
     *
     * @param indexOfCarToMove index of what Car to move
     * @param destinationIndex index of where Car should be moved
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car carToMove = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, carToMove);
    }
}
