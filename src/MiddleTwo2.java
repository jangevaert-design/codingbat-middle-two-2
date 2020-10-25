public class MiddleTwo2 {
  public String middleTwo(String str) {
    int len = str.length();

    if (len == 2) {
      return str;
    }

    return str.substring((len / 2) - 1, (len / 2) + 1);
  }

}
