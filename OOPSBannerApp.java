    public class OOPSBannerApp {

   
    public static String[] buildO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

   
    public static String[] buildP() {
        return new String[] {
            " ***** ",
            "*     *",
            " ***** ",
            "*      ",
            "*      "
        };
    }

  
    public static String[] buildS() {
        return new String[] {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

 
    public static void main(String[] args) {

       
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        
        String[][] banner = { O, O, P, S };

       
        for (int i = 0; i < O.length; i++) {

            for (int j = 0; j < banner.length; j++) {
                System.out.print(banner[j][i] + "  ");
            }

            System.out.println();
        }
    }
}
