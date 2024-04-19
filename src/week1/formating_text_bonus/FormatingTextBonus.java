package week1.formating_text_bonus;

public class FormatingTextBonus {
    public static void main(String[] args) {

        String text = "Everybody _said_, it can't be done. Then came one who did not #KNOW# that and just made it.";

        StringBuilder formatted = new StringBuilder();

            int i = 0;
            while (i < text.length()) {
                char currentChar = text.charAt(i);

                    if (currentChar == '_') {
                        int end = text.indexOf('_', i + 1);
                        if (end != -1) {
                            String word = text.substring(i + 1, end).toUpperCase();
                            formatted.append(word);
                            i = end + 1;
                        } else {
                            formatted.append(currentChar);
                            i++;
                        }
                    }
                    else if (currentChar == '#') {
                        int end = text.indexOf('#', i + 1);
                        if (end != -1) {
                            String word = text.substring(i + 1, end).toLowerCase();
                            formatted.append(word);
                            i = end + 1;
                        } else {
                            formatted.append(currentChar);
                            i++;
                        }
                    }
                    else {
                        formatted.append(currentChar);
                        i++;
                    }
                }

                System.out.println(formatted.toString());
            }
        }

