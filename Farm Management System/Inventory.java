public class Inventory {
    private double fertilizerStock;
    private double waterSupply;

    public Inventory(double fertilizerStock, double waterSupply) {
        this.fertilizerStock = fertilizerStock;
        this.waterSupply = waterSupply;
    }

    // Methods for inventory management like adding resources and using them
    // Example:
    public void addFertilizer(double amount) {
        this.fertilizerStock += amount;
    }
}
