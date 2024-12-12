
//SEBASTIAN BLUNT 11/04/24
public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int totalDays;
    private int activeDays;

    public StepTracker(int minSteps) {
        this.minSteps = minSteps;
        this.totalSteps = 0;
        this.totalDays = 0;
        this.activeDays = 0;
    }

    public void addDailySteps(int steps) {
        totalSteps += steps;
        totalDays++;
        
        if (steps >= minSteps) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (totalDays == 0) {
            return 0.0;
        }
        return (double) totalSteps / totalDays;
    }
}
