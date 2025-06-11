package org.example;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class PremiumUsers implements FileDownloader {
    private Date subscriptionEnd;

    public PremiumUsers(Date subscriptionEnd) {
        this.subscriptionEnd = subscriptionEnd;
    }

    @Override
    public void download(int mb) {
        System.out.println("✅ Premium download: File size " + mb + "MB");
    }

    public boolean downloaded() {
        LocalDate currentDate = LocalDate.now();
        Date current = Date.from(currentDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        return subscriptionEnd.after(current);
    }
}
