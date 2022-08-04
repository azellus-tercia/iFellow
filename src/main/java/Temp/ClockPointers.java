package Temp;

public class ClockPointers {

    /**
     * Returns the shortest angle between hours and minutes clock pointers
     * @param hours gets int between 0 and 12
     * @param minutes gets int between 0 and 60
     * @return the shortest angle
     * @throws IllegalArgumentException if (hours < 0 || hours > 12 || minutes < 0 || minutes > 60)
     */

    public double getPointersDegree(int hours, int minutes) {
        if ((hours < 0 || hours > 12) || (minutes < 0 || minutes > 60)) {
            throw new IllegalArgumentException("Hours or minutes are out of range.");
        }

        double minutesDegree = minutes * 6;
        double hoursDegree = hours * 30 + minutes * 0.5;
        double difference = Math.abs(hoursDegree - minutesDegree);

        if (difference > 180) {
            return 360 - difference;
        }

        return difference;
    }
}