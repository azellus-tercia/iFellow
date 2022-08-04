package Temp;

public class BaseConverter {

    /**
     * Method converts Celsius degrees to other allowed types of degrees metric system
     * @param celsiusDegrees gets initial Celsius degrees
     * @param convertType gets type to convert Celsius degrees to. Can get parameters:
     *                    'K' to Kelvins,
     *                    'F' to Fahrenheits
     * @return double type of transferred degrees
     * @throws IllegalArgumentException if (convertType != 'K' || convertType != 'F')
     */

    public double convert(int celsiusDegrees, char convertType) {
        if (convertType == 'K') {
            return celsiusDegrees + 273.15;
        } else if (convertType == 'F') {
            return (celsiusDegrees * 9.0 / 5) + 32;
        } else {
            throw new IllegalArgumentException("Unexpected value: " + convertType + ". Read description for more information.");
        }
    }
}