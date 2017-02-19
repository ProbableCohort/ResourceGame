package com.nm.lang;

import com.sun.tools.javac.util.Assert;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author brent
 * @since 2/18/17
 */
public final class PrintUtil {

  private static final Logger LOG = Logger.getLogger(PrintUtil.class.getName());

  private static final int DEFAULT_BUFFER_SIZE = 3;
  private static final char DEFAULT_SYMBOL = '*';
  private static final AnsiColor DEFAULT_COLOR = AnsiColor.CYAN;
  private static final int DEFAULT_LINE_LENGTH = 30;

  private PrintUtil() {
  }

  public static void wrapLine(String line) {
    wrapLine(line, DEFAULT_SYMBOL, DEFAULT_BUFFER_SIZE, DEFAULT_COLOR);
  }

  public static void wrapLine(String line, AnsiColor color) {
    wrapLine(line, DEFAULT_SYMBOL, DEFAULT_BUFFER_SIZE, color);
  }

  public static void wrapLine(String line, char symbol) {
    wrapLine(line, symbol, DEFAULT_BUFFER_SIZE, DEFAULT_COLOR);
  }

  public static void wrapLine(String line, char symbol, AnsiColor color) {
    wrapLine(line, symbol, DEFAULT_BUFFER_SIZE, color);
  }

  public static void wrapLine(String line, String symbolString) {
    wrapLine(line, symbolString, DEFAULT_COLOR);
  }

  /**
   * Wraps a line in a given symbol, given as a String, with a given color
   * The String must be exactly 1 character or an error is thrown and the DEFAULT_SYMBOL
   * will be used
   *
   * @param line
   * @param symbolString
   * @param color
   */
  public static void wrapLine(String line, String symbolString, AnsiColor color) {
    char symbol;
    if (symbolString != null && symbolString.length() == 1) {
      char[] chars = symbolString.toCharArray();
      symbol = chars[0];
    } else {
      charError(symbolString);
      symbol = DEFAULT_SYMBOL;
    }
    wrapLine(line, symbol, DEFAULT_BUFFER_SIZE, color);
  }

  /**
   * Wraps a line in a given symbol, with a given color
   * e.g. for "Some text" with the symbol '#':
   * #################
   * ### Some Text ###
   * #################
   *
   * @param line
   * @param symbol
   * @param bufferSize
   * @param color
   */
  public static void wrapLine(String line, char symbol, int bufferSize, AnsiColor color) {

    Assert.checkNonNull(line, "Cannot wrap a null line");
    String bufferedLine = bufferLine(line, symbol, bufferSize, color);
    int bufferedLineLength = bufferSize * 2 + 2 + line.length();
    String divider = createDividerLine(symbol, bufferedLineLength);
    System.out.println(ColorUtil.colorText(color, divider));
    System.out.println(bufferedLine);
    System.out.println(ColorUtil.colorText(color, divider));
    ColorUtil.resetColor();
  }

  /**
   * Prints a divider line
   *
   */
  public static void printDivider() {
    printDivider(DEFAULT_COLOR);
  }

  /**
   * Prints a divider line of the given color
   *
   * @param color
   */
  public static void printDivider(AnsiColor color) {
    System.out.println(ColorUtil.colorText(color, createDividerLine()));
  }

  /**
   * Prints the given number of divider lines
   *
   * @param lines
   */
  public static void printDividers(int lines) {
    printDividers(DEFAULT_COLOR, lines);
  }

  /**
   * Prints the given number of divider lines in the given color
   * @param color
   * @param lines
   */
  public static void printDividers(AnsiColor color, int lines) {
    for (int i = 0; i < lines; i++) {
      printDivider(color);
    }
  }

  /**
   * Buffers the line with the given symbol, for the buffer size
   * e.g. for "Some Text" with a buffer size of five and the symbol '#':
   * ##### Some Text #####
   *
   * @param line
   * @param symbol
   * @param bufferSize
   * @param color
   * @return
   */
  private static String bufferLine(String line, char symbol, int bufferSize, AnsiColor color) {
    String buffer = "";
    for (int i = 0; i < bufferSize; i++) {
      buffer += symbol;
    }
    StringBuilder bufferedLine = new StringBuilder();
    bufferedLine.append(buffer).append(" ").append(ColorUtil.colorText(ColorUtil.getComplementaryColor(color), line)).append(" ").append(ColorUtil.colorText(color, buffer));
    return bufferedLine.toString();
  }

  /**
   * Creates a divider line with the given number of characters
   *
   * @param symbol
   * @param bufferedLineLength
   * @return
   */
  private static String createDividerLine(char symbol, int bufferedLineLength) {
    StringBuilder divider = new StringBuilder();
    for (int i = 0; i < bufferedLineLength; i++) {
      divider.append(symbol);
    }
    return divider.toString();
  }

  /**
   * Creates a default divider line
   *
   * @return
   */
  private static String createDividerLine() {
    return createDividerLine(DEFAULT_SYMBOL, DEFAULT_LINE_LENGTH) + AnsiColor.RESET.getColorCode();
  }

  /**
   * Displays an error if the symbolString did not meet the criteria to be used as a a symbol character
   *
   * @param symbolString
   */
  private static void charError(String symbolString) {
    if (symbolString != null) {
      LOG.log(Level.WARNING, String.format("Cannot accept a String with length %d as the line wrapping character", symbolString.length()));
    } else {
      LOG.log(Level.WARNING, "Cannot accept a null String as the line wrapping character");
    }
  }
}
