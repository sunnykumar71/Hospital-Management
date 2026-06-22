# 🏥 Hospital Management System (Backend)

A secure and scalable **Hospital Management System Backend** built using **Spring Boot**. The application implements **JWT Authentication** and **Role-Based Access Control (RBAC)** to provide secure access to hospital resources for different types of users.

---

## 🚀 Features

* 🔐 User Registration & Login
* 🔑 JWT Authentication
* 👥 Role-Based Access Control (Admin, Doctor, Patient)
* 🏥 Hospital Management APIs
* 👨‍⚕️ Doctor Management
* 🧑‍🤝‍🧑 Patient Management
* 📅 Appointment Management
* 💊 Secure REST APIs
* ✅ Input Validation
* ⚠️ Global Exception Handling
* 🗄️ MySQL Database Integration
* 📖 RESTful API Design

---

## 🛠️ Tech Stack

| Technology      | Description                       |
| --------------- | --------------------------------- |
| Java 17+        | Programming Language              |
| Spring Boot     | Backend Framework                 |
| Spring Security | Authentication & Authorization    |
| JWT             | Secure Token-Based Authentication |
| Spring Data JPA | ORM Framework                     |
| Hibernate       | Database Mapping                  |
| MySQL           | Database                          |
| Maven           | Dependency Management             |
| Postman         | API Testing                       |

---

## 📂 Project Structure

```text
src
├── controller
├── service
├── repository
├── entity
├── dto
├── config
├── security
├── exception
└── HospitalManagementApplication.java
```

---

## 🔑 Authentication

The application uses **JWT (JSON Web Token)** for secure authentication.

### Authentication Flow

1. User registers an account.
2. User logs in using email and password.
3. Server validates credentials.
4. JWT token is generated.
5. Client stores the token.
6. Token is included in the Authorization header for protected APIs.

Example Header:

```http
Authorization: Bearer <JWT_TOKEN>
```

---

## 👥 Roles

### Admin

* Manage doctors
* Manage patients
* Manage appointments
* Access all APIs

### Doctor

* View assigned appointments
* Update appointment status
* Access patient information

### Patient

* Register account
* Book appointments
* View appointment history

---

## 📌 REST API Endpoints

### Authentication

| Method | Endpoint             | Description   |
| ------ | -------------------- | ------------- |
| POST   | `/api/auth/register` | Register User |
| POST   | `/api/auth/login`    | Login User    |

### Doctor APIs

| Method | Endpoint            |
| ------ | ------------------- |
| GET    | `/api/doctors`      |
| POST   | `/api/doctors`      |
| PUT    | `/api/doctors/{id}` |
| DELETE | `/api/doctors/{id}` |

### Patient APIs

| Method | Endpoint             |
| ------ | -------------------- |
| GET    | `/api/patients`      |
| POST   | `/api/patients`      |
| PUT    | `/api/patients/{id}` |
| DELETE | `/api/patients/{id}` |

### Appointment APIs

| Method | Endpoint                 |
| ------ | ------------------------ |
| GET    | `/api/appointments`      |
| POST   | `/api/appointments`      |
| PUT    | `/api/appointments/{id}` |
| DELETE | `/api/appointments/{id}` |

---

## ⚙️ Installation

### Clone Repository

```bash
git clone https://github.com/your-username/hospital-management-system.git
```

### Navigate to Project

```bash
cd hospital-management-system
```

### Configure Database

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Run the Application

```bash
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

## 🧪 API Testing

Use **Postman** to test all REST APIs.

* Register a new user
* Login to receive a JWT token
* Add the token to the Authorization header
* Access protected endpoints

---

## 📈 Future Enhancements

* Email Notifications
* Password Reset via Email
* File Upload for Medical Reports
* Payment Integration
* Swagger/OpenAPI Documentation
* Docker Deployment
* Role Management Dashboard
* Audit Logging

---

## 👨‍💻 Author

**Sunny Kumar**

* B.Tech CSE, IIIT Kalyani
* Java Full Stack Developer
* Spring Boot | Java | MySQL | React | JWT | REST APIs

---

## 📄 License

This project is open-source and available under the **MIT License**.
