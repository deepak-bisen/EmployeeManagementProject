//lex_auth_0130008620764692481835
//do not modify the above line

package emp;

public class Resources {
public static int getMonth(String month) {
	 // Map of month short names to their corresponding numbers
    switch (month) {
        case "Jan": return 1;
        case "Feb": return 2;
        case "Mar": return 3;
        case "Apr": return 4;
        case "May": return 5;
        case "Jun": return 6;
        case "Jul": return 7;
        case "Aug": return 8;
        case "Sep": return 9;
        case "Oct": return 10;
        case "Nov": return 11;
        case "Dec": return 12;
        default: return 0; // invalid input
    }
}
}