package com.nm.lang;

/**
 * Created by brent on 2/18/17.
 */
public enum AnsiColor {
  RESET(0, "\u001B[0m"),
  BLACK(1, "\u001B[37m"),
  BLUE(2, "\u001B[34m"),
  CYAN(3, "\u001B[36m"),
  GREEN(4, "\u001B[32m"),
  PURPLE(5, "\u001B[35m"),
  RED(6, "\u001B[31m"),
  WHITE(7, "\u001B[30m"),
  YELLOW(8, "\u001B[33m")
  ;

  private final int colorId;
  private final String colorCode;

  AnsiColor(int colorId, String colorCode) {
    this.colorId = colorId;
    this.colorCode = colorCode;
  }

  public String getColorCode() {
    return colorCode;
  }
}
