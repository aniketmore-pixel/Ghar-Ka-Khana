# Ghar Ka Khana

## Project Description
**Ghar Ka Khana** is a comprehensive Java-based desktop application designed to manage a homemade food business efficiently. The application allows admins and staff to manage products, categories, users, and billing, providing a user-friendly interface for smooth operations.

## Screenshots
> *(Include screenshots of your application UI here)*

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

