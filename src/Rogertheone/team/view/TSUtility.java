package Rogertheone.team.view;

import java.util.*;
/**
 * 
 * @Description The TSUtility.java class is provided in the project, which can be used to facilitate keyboard access.
 * @author shkstart  Email:shkstart@126.com
 * @version 
 * @date 2019/2/12/ 12:02:58
 *
 */
public class TSUtility {
    private static Scanner scanner = new Scanner(System.in);
    /**
     * 
     * @Description This method reads the keyboard, and if the user types any character from '1' to '4',
     * the method returns.
     * The return value is the character typed by the user.
     * @author shkstart
     * @date 2019/2/12/ 12:03:30
     * @return
     */
	public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' &&
                c != '3' && c != '4') {
                System.out.print("Selection error, please re-enter: ");
            } else break;
        }
        return c;
    }

    public static void readReturn() {
        System.out.print("Enter return to continue: ");
        readKeyBoard(100, true);
    }
    /**
     * 
     * @Description This method reads an integer with a length
     * of no more than 2 bits from the keyboard and uses it as the return value of the method.
     * @author shkstart
     * @date 2019/2/12 12:04:04
     * @return
     */
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Number entered error, please re-enter：");
            }
        }
        return n;
    }
    /**
     * 
     * @Description Read 'Y' or 'N' from the keyboard and use it as the return value of the method.
     * @author shkstart
     * @date 2019/2/12 12:04:45
     * @return
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("Selection error, please re-enter：");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("Entered length（not greater than" + limit + "）error，please re-enter：");
                continue;
            }
            break;
        }

        return line;
    }
}

