# 🤖 WhatsApp Chatbot Backend (Spring Boot)

## 📌 Overview

This project is a **WhatsApp chatbot backend simulation** built using Java and Spring Boot.
It mimics how a webhook receives messages and responds with predefined replies.

The application also includes a **simple web-based chat UI** for easy interaction.

---

## 🚀 Features

* REST API endpoint `/webhook`
* Accepts JSON input
* Returns predefined responses (Hi → Hello, Bye → Goodbye)
* Logs incoming messages in console
* Simple chat UI (HTML, CSS, JavaScript)
* Timestamp for each message

---

## 🛠 Tech Stack

* Java
* Spring Boot
* HTML, CSS, JavaScript

---

## 📂 Project Structure

```
src/
 ├── controller/   → Handles API requests
 ├── service/      → Contains chatbot logic
 ├── model/        → Request & response classes
resources/
 └── static/       → Frontend UI (index.html)
```

---

## ▶️ How to Run

1. Clone the repository:

```
git clone <your-repo-link>
```

2. Navigate to the project folder:

```
cd chatbot
```

3. Run the application:

```
mvn spring-boot:run
```

4. Open in browser:

```
http://localhost:8080
```

---

## 📡 API Details

### Endpoint

```
POST /webhook
```

### Request Body

```json
{
  "message": "Hi"
}
```

### Response

```json
{
  "reply": "Hello",
  "time": "10:45 PM"
}
```

---

## 💬 Sample Inputs & Outputs

| Input       | Output           |
| ----------- | ---------------- |
| Hi          | Hello            |
| Bye         | Goodbye          |
| How are you | I'm doing great! |
| Thanks      | You're welcome!  |

---

## 📸 Screenshots

### Chat UI
![UI](screenshots/ui.png)

### Conversation
![Screenshot%202026-04-27%20161019.png](screenshots/chat.png)


---

## 🎥 Demo Video

([SpringBoot_Chatbot_Webhook_Assignment_Demo](https://drive.google.com/file/d/1cFvvhwXwWNBFTDcFGCUuc89kU1oWgV7a/view?usp=sharing))

---

## ✅ Assignment Coverage

✔ REST API created (`/webhook`)
✔ JSON input handling
✔ Predefined responses
✔ Message logging
✔ Local deployment
✔ UI for interaction

---

## ⭐ Notes

* This is a simulation of a WhatsApp chatbot backend
* No actual WhatsApp API integration is used
* Designed for learning and demonstration purposes

---

## 👤 Author

Rupesh
