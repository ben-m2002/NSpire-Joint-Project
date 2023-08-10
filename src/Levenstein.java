import java.util.Map;
import java.util.Set;

public class Levenstein {

  private Set<String> allKeys;

  public Set<String> getAllKeys() {
    return allKeys;
  }

  public void setAllKeys(Set<String> allKeys) {
    this.allKeys=allKeys;
  }

  /**
   * This function takes an input string. It then goes word for word and checks if the value
   * is in allKeys set it appends it to the result, if it is not then it does edit distance and see
   * if there is a closer word that is a key. If there is we append new key word to output
   * If not we just append it to the output.
   * @param str
   * @return
   */
  public String reBuildInput (String str){

    return "";
  }

  /**
   * Uses traditional levenstein-Distance algorithm to calculate edit distance of the values
   * @param str1
   * @param str2
   * @return
   */
  public int calculateLevenshteinDistance(String str1, String str2) {
    int len1 = str1.length();
    int len2 = str2.length();
    int[][] dp = new int[len1 + 1][len2 + 1];

    for (int i = 0; i <= len1; i++) {
      dp[i][0] = i;
    }

    for (int j = 0; j <= len2; j++) {
      dp[0][j] = j;
    }

    // if there is no change cost is 0 for those words, if there is a change cost is 1

    for (int i = 1; i <= len1; i++) {
      for (int j = 1; j <= len2; j++) {
        int cost = (str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0 : 1;
        dp[i][j] = Math.min(Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1), dp[i - 1][j - 1] + cost);
      }
    }

    return dp[len1][len2];
  }

  /**
   * Takes in an input and changes it to an alpha-numeric version.
   * @param input
   * @return
   */
  public String stripString (String input){
    input = input.replaceAll("[^a-zA-Z0-9 ]", ""); // Removing any non-alphanumeric characters
    return input;
  }

}
