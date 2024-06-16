import java.time.LocalDate;

public class Schedule {
    private Crop crop;
    private LocalDate plantingDate;
    private String actionsNeeded;

    public Schedule(Crop crop, LocalDate plantingDate, String actionsNeeded) {
        this.crop = crop;
        this.plantingDate = plantingDate;
        this.actionsNeeded = actionsNeeded;
    }

    // Methods for schedule management like updating schedules and printing details
    // Example:
    public void updateSchedule(LocalDate newDate) {
        this.plantingDate = newDate;
    }
}
