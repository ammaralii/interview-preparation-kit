package utils;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CaptureOutput {
    public static String captureStandardOutput(Runnable runnable) {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final PrintStream ps = new PrintStream(baos);
        final PrintStream old = System.out;
        System.setOut(ps);
        try {
            runnable.run();
        } finally {
            System.out.flush();
            System.setOut(old);
        }
        return baos.toString();
    }
}
