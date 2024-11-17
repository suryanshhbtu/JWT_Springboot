# Getting Started

## Installation
* Java 17
* Maven Latest

## API Endpoints

---

### **1. Sign Up API**

#### **Endpoint**
`POST /auth/signup`


#### **Request Body Parameters**

| Parameter  | Type     | Description                         |
|------------|----------|-------------------------------------|
| `username` | `string` | **Required**. The desired username. |
| `password` | `string` | **Required**. User's password.      |
| `email`    | `string` | **Required**. User's email address. |



#### **Sample Request**

```json
{
  "username": "suryansh",
  "password": "abc",
  "email": "suryansh@gmail.com"
}
```

### **2. Sign In API**

#### **Endpoint**
`POST /auth/signin`


#### **Request Body Parameters**

| Parameter  | Type     | Description                         |
|------------|----------|-------------------------------------|
| `username` | `string` | **Required**. The desired username. |
| `password` | `string` | **Required**. User's password.      |
| `email`    | `string` | **Required**. User's email address. |



#### **Sample Request**

```json
{
  "username": "suryansh",
  "password": "abc",
  "email": "suryansh@gmail.com"
}
