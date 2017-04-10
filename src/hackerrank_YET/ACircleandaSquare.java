package hackerrank_YET;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ACircleandaSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        int circleX = in.nextInt();
        int circleY = in.nextInt();
        int r = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        for (int i = 0 ; i < h; i++) {
            for(int j = 0; j < w; j++) {
                String out = "";
                if((circleX - j)*(circleX - j)+(circleY - i)*(circleY - i) <= r*r) {
                    System.out.print("#");
                } else {
                    
                    if (checker(x1, y1, x3, y3, i, j)) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
    }
    static boolean checker(int x1, int y1, int x3, int y3, int i, int j) {

        int v1x = x3 - x1;
        int v1y = y3 - y1;
        int v2x = x1 - x3;
        int v2y = y1 - y3;
        int b1x = i - x1;
        int b1y = j - y1;
        int b2x = i - x3;
        int b2y = j - y3;
        double angle1 = Math.atan2((double)(v1x), (double)(v1y)) - Math.atan2((double)(b1x), (double)(b1y));
        double angle2 = Math.atan2((double)(v2x), (double)(v2y)) - Math.atan2((double)(b2x), (double)(b2y));
        return Math.toDegrees(angle1) >= -45 && Math.toDegrees(angle1) <= 45
                && Math.toDegrees(angle2) >= -45 && Math.toDegrees(angle2) <= 45;
    }
}

