package lab8;

public class lab8 {
    public static final double sum(double... x) {
        double tong = 0;
        for (double i : x) {
            tong += i;
        }
        return tong;
    }

    public static final double min(double... x) {
        double min = x[0];
        for (double i : x) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static final double max(double... x) {
        double max = x[0];
        for (double i : x) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static String toUpperFirstChar(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);

            words[i] = upperFirstChar + words[i].substring(1);
        }
        return String.join("", words);
    }

}
