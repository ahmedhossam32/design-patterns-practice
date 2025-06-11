package org.example;

public class Main {
    public static void main(String[] args) {
        FileDownloader downloader = new ProxyDownloader();

        System.out.println("---- Free Trial Tests ----");
        downloader.download(50);  // free
        downloader.download(20);  // free
        downloader.download(99);  // free
        downloader.download(30);  // free
        downloader.download(70);  // free
        downloader.download(80);  // should trigger premium (limit reached)

        System.out.println("\n---- Large File Test ----");
        downloader.download(150); // too large → premium

        System.out.println("\n---- Reuse Premium ----");
        downloader.download(120); // already premium now

        System.out.println("\n---- Final Free Use Check ----");
        System.out.println("Total free uses: " + ((ProxyDownloader) downloader).getFreeUse());
    }
}