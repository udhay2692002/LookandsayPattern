public class lookandsaypattern {
    public static void main(String[] args) {
        int n = 5; // Number of lines in the pattern
        String currentLine = "1"; // Start with the first line

        for (int i = 0; i < n; i++) {
            System.out.println(currentLine); // Print the current line
            currentLine = describeLine(currentLine); // Generate the next line
        }
    }

    // Function to describe a line based on the previous line
    public static String describeLine(String line) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char prevChar = line.charAt(0);

        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) == prevChar) {
                count++;
            } else {
                result.append(count).append(prevChar);
                count = 1;
                prevChar = line.charAt(i);
            }
        }

        result.append(count).append(prevChar); // Append the count and character for the last group
        return result.toString();
    }
}

/*
1
11
21
1211
111221
 */