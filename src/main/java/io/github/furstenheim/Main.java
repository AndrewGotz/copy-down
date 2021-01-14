package io.github.furstenheim;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

  public static void main(final String[] args) throws Exception {
    final CopyDown converter = new CopyDown();
    final StringBuilder contentBuilder = new StringBuilder();
    try (final BufferedReader in = new BufferedReader(
        new FileReader("Sample.html"))) {
      String str;
      while ((str = in.readLine()) != null) {
        contentBuilder.append(str);
      }
    } catch (final IOException e) {
    }
    final String myHtml = contentBuilder.toString();
    final String markdown = converter.convert(myHtml);
    try (final BufferedWriter writer = new BufferedWriter(
        new FileWriter("Sample.md"))) {
      writer.write(markdown);
    } catch (final Exception e) {
      e.printStackTrace();
    }
  }

}
