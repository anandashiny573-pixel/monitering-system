# 🌱 Smart Farm Monitor

## 📌 Project Title
**Smart Farm Monitor using ThingSpeak API (Java)**

---

## 📖 Description
The **Smart Farm Monitor** is a Java-based application that connects to the **ThingSpeak IoT cloud platform** to fetch and display real-time sensor data from a smart agriculture monitoring system.

This project helps farmers or users monitor environmental conditions such as:
- Soil Moisture  
- Temperature  
- Humidity  
- Water Level  
- Other IoT Sensor Values  

The application uses HTTP requests to retrieve the latest data from a ThingSpeak channel and displays it in the console.

---

## ⚙️ Technologies Used
- Java  
- ThingSpeak Cloud API  
- HTTPURLConnection  
- BufferedReader & InputStreamReader  
- JSON Data Handling  

---

## 🧩 Requirements
Before running the program, ensure you have:
- Java JDK (JDK 8 or above)  
- Active Internet Connection  
- ThingSpeak Account  
- ThingSpeak Channel ID  
- ThingSpeak Read API Key  

---

## 🔧 Setup Instructions

### Step 1: Create ThingSpeak Channel
1. Visit https://thingspeak.com  
2. Create a new channel  
3. Add fields (Temperature, Soil Moisture, etc.)  
4. Save the channel  

### Step 2: Get API Details
- Copy **Channel ID**  
- Copy **Read API Key**  

### Step 3: Update Java Code
Replace the following lines in your Java file:
```java
String channelID = "YOUR_CHANNEL_ID";
String readAPI = "YOUR_READ_API_KEY";
