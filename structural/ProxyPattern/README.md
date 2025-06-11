# 📦 Proxy Design Pattern – File Downloader Example

## 🧩 Pattern Type: Structural

This example demonstrates the **Proxy Design Pattern** by simulating a cloud-based file downloader system. The proxy controls access to downloading files based on whether the user is a free user or a premium subscriber.

---

## ❓ Problem Statement

In a file downloading system, we want to restrict certain features:

- **Free users** can:
  - Download files **smaller than 100MB**
  - Download **up to 5 times** total

- **Premium users** can:
  - Download any file size
  - Download unlimited times as long as their **subscription is valid**

We need a solution that:
- Doesn’t modify the existing downloader logic
- Adds access control and rules externally
- Keeps code clean and extendable

---

## ✅ Solution Using Proxy

We implement a `ProxyDownloader` class that wraps around a `PremiumUsers` class. Both implement the same `FileDownloader` interface. The proxy is responsible for:

- Tracking the number of free uses
- Checking if the file size is under the limit
- Automatically subscribing the user to a 1-month premium trial when limits are exceeded
- Delegating the actual download operation to the `PremiumUsers` class

---

## 📦 Class Structure

| Class             | Description                              |
|------------------|------------------------------------------|
| `FileDownloader` | Interface defining the `download(int mb)` method |
| `PremiumUsers`   | Real object that performs the download    |
| `ProxyDownloader`| Proxy that controls access and delegates  |

---


---

## 💻 Sample Output

```text
---- Free Trial Tests ----
🆓 Free trial download: 50MB
🆓 Free trial download: 20MB
🆓 Free trial download: 99MB
🆓 Free trial download: 30MB
🆓 Free trial download: 70MB
⚠️ Free uses expired. Switching to premium...
🆕 Subscribed to 1-month trial. Ends on: Tue Jul 11 00:00:00 EET 2025
✅ Premium download: File size 80MB

---- Large File Test ----
⚠️ File too large for free trial. Requires premium.
✅ Premium download: File size 150MB

---- Reuse Premium ----
✅ Premium download: File size 120MB

---- Final Free Use Check ----
Total free uses: 5
