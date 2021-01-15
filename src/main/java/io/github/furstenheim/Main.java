package io.github.furstenheim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

  private static String readHtml() throws Exception {
    final StringBuilder contentBuilder = new StringBuilder();
    try (final BufferedReader in = new BufferedReader(
        new FileReader("Copy-of-CareAware-Core-JIRA-Best-Practices_2423661312.html"))) {
      String str;
      while ((str = in.readLine()) != null) {
        contentBuilder.append(str);
      }
    }
    return contentBuilder.toString();
  }

  private static void writeMarkDown(final String markdown) throws Exception {
    try (final BufferedWriter writer = new BufferedWriter(
        new FileWriter("Sample.md"))) {
      writer.write(markdown);
    }
  }

  public static void main(final String[] args) throws Exception {
    final String myHtml = readHtml();
    final CopyDown converter = new CopyDown();
    final String markdown = converter.convert(myHtml);
    writeMarkDown(markdown);
  }

}
