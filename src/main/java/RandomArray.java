public class RandomArray {
    private final double[] randomArray;

    /**
     * Constructor creates the array of defined amount (at least two elements), filled with random double numbers between (0, 1)
     * @param sizeOfArray size of array
     * @throws RuntimeException if (sizeOfArray < 2)
     */

    RandomArray(int sizeOfArray) {
        if (sizeOfArray < 2) {
            throw new RuntimeException("Incorrect size of array. Size of array have to be 2 or greater.");
        }

        randomArray = new double[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            randomArray[i] = Math.random();
        }
    }

    public double maxValue() {
        double maxValue = Double.MIN_VALUE;
        for (double value : randomArray) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }

    public double minValue() {
        double minValue = Double.MAX_VALUE;
        for (double value : randomArray) {
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }

    public double averageValue() {
        return (maxValue() + minValue()) / 2;
    }
}