public class vikram {
    public static void main(String[] args) throws Exception{
        String[] V = {
            "*       *",
            " *     * ",
            "  *   *  ",
            "   * *   ",
            "    *    "
        };
        
        String[] I = {
            "*******",
            "   *   ",
            "   *   ",
            "   *   ",
            "*******"
        };
        
        String[] K = {
            "*    *",
            "*  *  ",
            "**    ",
            "*  *  ",
            "*    *"
        };
        
        String[] R = {
            "****  ",
            "*   * ",
            "****  ",
            "*  *  ",
            "*   * "
        };
        
        String[] A = {
            "   *   ",
            "  * *  ",
            " ***** ",
            "*     *",
            "*     *"
        };
        
        String[] M = {
            "*     *",
            "**   **",
            "* * * *",
            "*  *  *",
            "*     *"
        };
        
        String[][] letters = {V, I, K, R, A, M};
        
        for (int i = 0; i < 5; i++) {
            for (String[] letter : letters) {
                System.out.print(letter[i] + "  ");
                Thread.sleep(1000);
            }
            System.out.println();
        }
    }
}
