public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = String.join("\n",

                " ****   ****  *****  ***** ",
                "*    * *    * *    * *     ",
                "*    * *    * *    * *     ",
                "*    * *    * *****   **** ",
                "*    * *    * *           *",
                "*    * *    * *           *",
                " ****   ****  *      ***** "

        ).split("\n");

        for (String line : banner) {
            System.out.println(line);
        }
    
}
 }


