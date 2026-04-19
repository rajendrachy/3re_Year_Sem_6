class simple {
    public static boolean isMatch(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        // Time Complexity: O(n * m)
        // Space Complexity: O(1)

        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }

            if (j == m) {
                return true; // pattern found
            }
        }

        return false; // pattern not found
    }

    public static void main(String[] args) {
        String text = "ababcabcabababd";
        String pattern = "ababd";

        System.out.println(isMatch(text, pattern));
    }
}

