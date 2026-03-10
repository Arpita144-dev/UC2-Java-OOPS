import java.util.HashMap;

public class UC8ASCII {

    public static void main(String[] args) {

        HashMap<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            for (char ch : word.toCharArray()) {
                System.out.print(patternMap.get(ch)[i] + " ");
            }
            System.out.println();
        }
    }
}