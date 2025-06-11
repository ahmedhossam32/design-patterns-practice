package org.example;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ProxyDownloader implements FileDownloader {
    private int freeUse = 0;
    private PremiumUsers premiumUser = null;

    @Override
    public void download(int mb) {
        if (freeUse >= 5) {
            System.out.println("⚠️ Free uses expired. Switching to premium...");
            downloadPremium(mb);
            return;
        }

        if (mb < 100) {
            System.out.println("🆓 Free trial download: " + mb + "MB");
            freeUse++;
        } else {
            System.out.println("⚠️ File too large for free trial. Requires premium.");
            downloadPremium(mb);
        }
    }

    private void downloadPremium(int mb) {
        if (premiumUser == null || !premiumUser.downloaded()) {
            LocalDate oneMonthLater = LocalDate.now().plusDays(30);
            Date subscriptionEnd = Date.from(oneMonthLater.atStartOfDay(ZoneId.systemDefault()).toInstant());
            premiumUser = new PremiumUsers(subscriptionEnd);
            System.out.println("🆕 Subscribed to 1-month trial. Ends on: " + subscriptionEnd);
        }

        premiumUser.download(mb);
    }

    public int getFreeUse() {
        return freeUse;
    }

    public void setFreeUse(int freeUse) {
        this.freeUse = freeUse;
    }
}
