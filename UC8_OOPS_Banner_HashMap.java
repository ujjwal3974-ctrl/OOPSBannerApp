import java.util.*;

public class UC8_OOPS_Banner_HashMap {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        String word = "OOPS";
        printBanner(word, patternMap);
    }

    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();
        map.put('O', new String[]{
                "  ***  ",
                " **  ** ",
                "**    **",
                "**    **",
                "**    **",
                " **  ** ",
                "  ***  "
        });
        map.put('P', new String[]{
                "*****  ",
                "**   ** ",
                "**   ** ",
                "*****  ",
                "**     ",
                "**     ",
                "**     "
        });
        map.put('S', new String[]{
                " ***** ",
                "**     ",
                "**     ",
                " ****  ",
                "     **",
                "     **",
                "*****  "
        });
        return map;
    }

    public static void printBanner(String word, Map<Character, String[]> map) {

        int height = map.get(word.charAt(0)).length;
        StringBuilder banner = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                banner.append(map.get(ch)[i]).append("   ");
            }
            banner.append("\n");
        }
        System.out.println(banner);
    }
}