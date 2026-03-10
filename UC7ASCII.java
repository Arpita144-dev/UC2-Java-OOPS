public class UC7ASCII {

    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        CharacterPattern[] word = {O, O, P, S};

        for (int i = 0; i < 7; i++) {
            String line = "";
            for (CharacterPattern cp : word) {
                line += cp.getPattern()[i] + " ";
            }
            System.out.println(line);
        }
    }
}