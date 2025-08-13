package com.chartiersvaley.archive;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.IntStream;

public class Generator {

  private static final String BASE_URL = "https://chartiersvalleypublic.ic-board.com/public_agendaview.aspx?mtgId=%s";


  public static void main(String[] args) {


    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("urls.txt"));

      IntStream.rangeClosed(0, 1000).forEach(meetingId -> {
        try {
          writer.write(String.format(BASE_URL, meetingId));
          writer.newLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      });

      writer.close();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}