import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {

        Scanner outerScanner = new Scanner(System.in);

        while (outerScanner.hasNextLine()){
            List<String> lines = new ArrayList<>();
            Scanner innerScanner = new Scanner(outerScanner.nextLine());

            while (innerScanner.hasNext()) {
                lines.add(innerScanner.next());
            }
            innerScanner.close();
            System.out.println(lines);
        }
        outerScanner.close();
    }
}
