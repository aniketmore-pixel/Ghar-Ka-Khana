# Ghar Ka Khana

## Project Description
**Ghar Ka Khana** is a comprehensive Java-based desktop application designed to manage a homemade food business efficiently. The application allows admins and staff to manage products, categories, users, and billing, providing a user-friendly interface for smooth operations.

## Screenshots
> <img width="960" height="540" alt="Screenshot 2023-11-07 163757" src="https://github.com/user-attachments/assets/6458cc1a-e88a-49a7-bd6d-a3b554817f39" />
> <img width="960" height="540" alt="Screenshot 2023-11-07 164255" src="https://github.com/user-attachments/assets/b5c38c35-db02-4c12-874f-14bd68e84cf2" />
> <img width="960" height="540" alt="Screenshot 2023-11-07 164313" src="https://github.com/user-attachments/assets/0081ee82-4efc-4625-abb3-82a12b7a6a5a" />
> <img width="960" height="540" alt="Screenshot 2023-11-07 164348" src="https://github.com/user-attachments/assets/8f9cf2e2-19f0-4a50-b341-a1533e2d0885" />
> <img width="960" height="540" alt="Screenshot 2023-11-07 164422" src="https://github.com/user-attachments/assets/0ad7fe3c-23cc-4412-8f6e-914379d4a75b" />
> <img width="960" height="433" alt="Screenshot 2023-11-07 164823" src="https://github.com/user-attachments/assets/bcac3226-ca8b-4711-9395-a067f50fd6b0" />
> <img width="960" height="540" alt="Screenshot 2023-11-07 170656" src="https://github.com/user-attachments/assets/a0cf1491-d0ba-4def-8d74-b881a587e193" />

## Features

### Product Management
- Add, update, delete, and view products.
- Assign products to specific categories.
- Track product prices.

### Category Management
- Create and manage different food categories (e.g., snacks, meals, beverages).

### User Management
- Add, update, and manage staff/admin accounts.
- Secure login using email and password.
- Track user account status.

### Billing
- Generate customer bills.
- Track orders by date, total amount, and created by.

### Interactive UI
- Built using **Java Swing**.
- Tables for listing products and categories.
- Combo boxes for selecting categories.
- Buttons for performing CRUD operations.

## Data Model Overview
- **User**: Represents application users (admins/staff).
- **Product**: Represents food items with name, category, and price.
- **Category**: Represents product categories.
- **Bill**: Stores billing information including customer details and order total.

## Technology Stack
- **Java SE** (Swing for GUI)
- **SQLite/MySQL** (or similar) for database
- **DAO Pattern** for database operations (e.g., `ProductDao`, `CategoryDao`)

## Installation
1. Clone the repository:
```bash
git clone <repository_url>
```
2. Open the project in **NetBeans IDE**.
3. Ensure that the database file is correctly configured in the `dao` classes.
4. Run the application by executing the `Main` class or the main JFrame (e.g., `ViewEditDeleteProduct.java`).

## Usage
1. Launch the application.
2. Navigate through different modules:
   - **Product Management**: Add, update, delete products.
   - **Category Management**: Manage product categories.
   - **User Management**: Manage users.
   - **Billing**: Generate bills for customer orders.
3. Click on table rows to edit or delete records.
4. Use the clear button to reset form fields.




## Contributors
- Aniket More 
- Aarya Arban
- Aryaa Patil
- Digvijaysingh Rajput

