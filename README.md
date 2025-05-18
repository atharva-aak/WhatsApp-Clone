
---

# 📱 WhatsApp Clone

An Android-based **WhatsApp Clone** built using **Java** and **Firebase**, replicating core functionalities of the popular messaging app. This project serves as a practical demonstration of real-time messaging, Firebase integration, and mobile app architecture for chat applications.

## 🚀 Features

* 🔐 **Phone Number Authentication** using Firebase
* 💬 **One-on-One Real-Time Messaging**
* 🖼️ **Image Sharing Support**
* 📶 **Firebase Realtime Database Integration**
* 👤 **User Presence (Online/Offline) Indicator**
* 📝 **Status Upload and View**
* 🔔 **Push Notifications (Optional Firebase Cloud Messaging Integration)**

## 📸 Screenshots

> *(Include screenshots of login screen, chat list, chat window, and status feature here if available)*

## 🛠️ Tech Stack

* **Language:** Java
* **IDE:** Android Studio
* **Backend:** Firebase Realtime Database & Firebase Authentication
* **Storage:** Firebase Cloud Storage (for image sharing)
* **Push Notifications:** Firebase Cloud Messaging (FCM)

## 📦 Project Structure

```
WhatsApp-Clone/
├── app/
│   ├── activities/           # UI screens like Login, Chat, Home
│   ├── adapters/             # RecyclerView adapters
│   ├── models/               # Data models (User, Message, Status)
│   └── utils/                # Helper classes (Firebase, Constants)
├── res/
│   ├── layout/               # XML layout files
│   └── drawable/             # App icons, backgrounds, etc.
└── build.gradle              # Build configuration
```

## 🔧 Setup Instructions

1. **Clone the Repository**

   ```bash
   git clone https://github.com/atharva-aak/WhatsApp-Clone.git
   ```

2. **Open in Android Studio**

   * File → Open → Select the project folder

3. **Connect Firebase**

   * Tools → Firebase → Connect to Firebase
   * Enable Authentication, Realtime Database, and Cloud Storage

4. **Update `google-services.json`**

   * Add your Firebase project's `google-services.json` file to the `app/` directory

5. **Run the App**

   * Connect an emulator or device and click **Run**

