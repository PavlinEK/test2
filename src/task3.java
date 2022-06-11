import java.util.Scanner;

public class task3 {

    static void diamondLineOutput(int diamondWidth, int i) {
        int sideDashesCount = (diamondWidth / 2 + diamondWidth % 2) - i;
        String sideDashes = stringRepeater("-", sideDashesCount);
        int diamondBodyWidth = diamondWidth - sideDashesCount * 2;
        String diamondBody;
        if (diamondBodyWidth > 1) {
            diamondBody = "*" + stringRepeater("-", diamondBodyWidth - 2) + "*";
        } else {
            diamondBody = "*";
        }
        System.out.println(sideDashes + diamondBody + sideDashes);
    }

    static String stringRepeater(String stringToRepeat, int stringRepeatCount) {
        String outputString = "";
        for (int i = 0; i < stringRepeatCount; i++) {
            outputString += stringToRepeat;
        }
        return outputString;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int width = Integer.parseInt(scan.nextLine());
        int topHeight = width / 2 + width % 2;
        int bottomHeight = (width % 2) == 0 ? (width - topHeight - 1) : (width - topHeight);

        for (int i = 1; i <= topHeight; i++) {
            diamondLineOutput(width, i);
        }
        for (int i = bottomHeight; i > 0; i--) {
            diamondLineOutput(width, i);
        }
        System.out.println("test + commit");
    }
}
