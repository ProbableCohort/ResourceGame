package com.nm.lang;

/**
 * @author brent
 * @since 2/18/17
 */
public final class ColorUtil {
  private ColorUtil() {}

  /**
   * Colors a String of text with a given AnsiColor
   *
   * @param color
   * @param text
   * @return
   */
  public static String colorText(AnsiColor color, StringBuilder text) {
    if (text ==  null) {
      return null;
    }
    return colorText(color, text.toString());
  }

  /**
   * Colors a String of text with a given AnsiColor
   *
   * @param color
   * @param text
   * @return
   */
  public static String colorText(AnsiColor color, String text) {
    if (color == null) {
      return text;
    }
    return color.getColorCode() + text;
  }

  /**
   * Resets the AnsiColor
   *
   */
  public static void resetColor() {
    System.out.print(AnsiColor.RESET.getColorCode());
  }

  /**
   * Gets a complementary AnsiColor given an AnsiColor
   *
   * @param color
   * @return
   */
  public static AnsiColor getComplementaryColor(AnsiColor color) {
    switch(color) {
      case CYAN:
        return AnsiColor.YELLOW;
      case PURPLE:
        return AnsiColor.GREEN;
      case RED:
        return AnsiColor.BLACK;
      case BLACK:
      case BLUE:
        return AnsiColor.WHITE;
      case WHITE:
        return AnsiColor.BLACK;
      default:
        return AnsiColor.RESET;
    }
  }
}
