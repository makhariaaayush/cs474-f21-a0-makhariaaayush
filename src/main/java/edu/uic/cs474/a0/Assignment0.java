package edu.uic.cs474.a0;

public class Assignment0 {
  public static void main(String[] args) {
    String yourKey = "00000000"; // Please replace the contents of this string with your key from Travis

    System.exit((args.length < 1 || !args[0].equals(yourKey)) ? 1 : 0);
  }
}
