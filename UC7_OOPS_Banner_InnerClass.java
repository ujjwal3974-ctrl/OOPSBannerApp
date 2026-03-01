public class UC7_OOPS_Banner_InnerClass {

    public static void main(String[] args) {
        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
                "   ***  ",
                " **  ** ",
                "**    **",
                "**    **",
                "**    **",
                " **  ** ",
                "   ***  "
        });

        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
                " *****  ",
                "**   ** ",
                "**   ** ",
                "*****  ",
                "**     ",
                "**     ",
                " **     "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
                "  ***** ",
                "**     ",
                "**     ",
                " ****  ",
                "     **",
                "     **",
                " *****  "
        });

        CharacterPatternMap[] word = {o, o, p, s};
        StringBuilder banner = new StringBuilder();
        int height = o.getPattern().length;
        for (int i = 0; i < height; i++) {
            for (CharacterPatternMap ch : word) {
                banner.append(ch.getPattern()[i]).append("   ");
            }
            banner.append("\n");
        }

        System.out.println(banner);
    }

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}
