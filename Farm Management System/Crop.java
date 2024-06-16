public class Crop {
    private String cropType;
    private double fertilizerAmount;
    private double waterAmount;

    public Crop(String cropType, double fertilizerAmount, double waterAmount) {
        this.cropType = cropType;
        this.fertilizerAmount = fertilizerAmount;
        this.waterAmount = waterAmount;
    }

    // Methods for crop management like irrigation and fertilizer application
    // Example:
    public void irrigate() {
        // Implement irrigation process
    }
}
