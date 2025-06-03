package Lesson_19.CrawlSongExample;

import java.net.URL;
import java.util.Scanner;

public class CrawlSongExample {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://zingmp3.vn/new-release/song?filter=all");
            Scanner  scanner = new Scanner(url.openStream());
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                if (line.contains("<a href=\"/bai-hat")){
                    int index = line.indexOf("<a href=\"/bai-hat");
                    String subLine = line.substring(index);
                    int index1 = subLine.indexOf(">");
                    String subLine1 = subLine.substring(index1 + 1);
                    int index2 = subLine1.indexOf("</a>");
                    String songName = subLine1.substring(0, index2);
                    System.out.println(songName);
                    System.out.println(line);
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
