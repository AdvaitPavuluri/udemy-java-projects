package com.advait;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        // 1 MB = 1024 KB

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes == 0) {
            System.out.println("0 KB = 0 MB and 0 KB");
        } else {
            int megaBytes = (kiloBytes / 1024);
            int remainder = (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }

    }



}

