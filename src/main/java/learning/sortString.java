package learning;

/*Program to sort all characters in a given string in ascending order without using any built-in functions.

 str="automation"

 output: aaimnoottu
 
 */

public class sortString {
    public static void main(String[] args) {

      
        String str = "automation";
        char[] charArray = str.toCharArray();
        
        // Sorting the character array using bubble sort
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (charArray[j] > charArray[j + 1]) {
                    // Swap charArray[j] and charArray[j + 1]
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }
        
        // Convert sorted character array back to string
        String sortedStr = new String(charArray);
        System.out.println(sortedStr);
    }
}
