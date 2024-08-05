class Solution {
    public String greatestLetter(String s) {
       Set<Character> lowercaseLetters = new HashSet<>();
        Set<Character> uppercaseLetters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercaseLetters.add(c);
            } else if (Character.isUpperCase(c)) {
                uppercaseLetters.add(c);
            }
        }
        for (char c = 'Z'; c >= 'A'; c--) {
            if (uppercaseLetters.contains(c) && lowercaseLetters.contains(Character.toLowerCase(c))) {
                return String.valueOf(c);
            }
        }
        return "";

    }

    }
