    public class OOPSBannerApp {

    // Method to generate pattern for O
    public static String[] buildO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method to generate pattern for P
    public static String[] buildP() {
        return new String[] {
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        };
    }

    // Method to generate pattern for S
    public static String[] buildS() {
        return new String[] {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Get character patterns using methods
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Store banner letters in array
        String[][] banner = { O, O, P, S };

        // Print banner line by line
        for (int i = 0; i < O.length; i++) {

            for (int j = 0; j < banner.length; j++) {
                System.out.print(banner[j][i] + "  ");
            }

            System.out.println();
        }
    }
}