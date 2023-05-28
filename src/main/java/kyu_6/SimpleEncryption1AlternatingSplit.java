package kyu_6;

//https://www.codewars.com/kata/57814d79a56c88e3e0000786/train/java
public class SimpleEncryption1AlternatingSplit {
    public static String encrypt(final String text, final int n) {
        if (text == null || text.length() == 0)
            return text;
        String result = text;
        for (int i = 0; i < n; i++) {
            String[] array = result.split("");
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();
            for (int j = 0; j < text.length(); j++) {
                if (j % 2 == 0)
                    even.append(array[j]);
                else
                    odd.append(array[j]);
            }
            result = odd.append(even).toString();
        }
        return result;
    }

    public static String decrypt(final String encryptedText, final int n) {
        if (encryptedText == null || encryptedText.length() == 0)
            return encryptedText;
        String result = encryptedText;
        for (int j = 0; j < n; j++) {
            String[] even = result.substring(result.length() / 2).split("");
            String[] odd = result.substring(0, result.length() / 2).split("");
            StringBuilder resultBuilder = new StringBuilder();
            for (int i = 0; i < even.length; i++) {
                resultBuilder.append(even[i]);
                if (i < odd.length)
                    resultBuilder.append(odd[i]);
            }
            result = resultBuilder.toString();
        }
        return result;
    }
}
