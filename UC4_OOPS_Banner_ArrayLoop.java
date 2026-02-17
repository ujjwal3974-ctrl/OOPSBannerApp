public class UC4_OOPS_Banner_ArrayLoop {
    public static void main(String[] args) {

        String[] bannerLines = {
                String.join("", " *****", "   ", "*****", "   ", "*****", "    ", "*****"),

                String.join("", " *   *", "   ", "*   *", "   ", "*   *", "   ", "*"),

                String.join("", " *   *", "   ", "*   *", "   ", "*   *", "    ", "****"),

                String.join("", " *   *", "   ", "*****", "   ", "*****", "        ", "*"),

                String.join("", " *   *", "   ", "*    ", "   ", "*    ", "        ", "*"),

                String.join("", " *   *", "   ", "*    ", "   ", "*    ", "   ", "*"),

                String.join("", " *****", "   ", "*    ", "   ", "*    ", "   ", "*****")
        };
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
