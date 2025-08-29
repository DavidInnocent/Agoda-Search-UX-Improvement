# Smart Holiday Booking (Inspired by Agoda)

A demo project showcasing a possible approach to enhance the holiday booking experience by providing **destination-based property availability with a calendar view**.

## Inspiration
Before going on holiday, customers usually have a fixed travel date. On many booking platforms (including Agoda), the flow is:
1. Choose a destination.
2. Choose a date.
3. Only then discover if properties are available.

This can frustrate customers if the chosen date has no availability — forcing them to repeat the search.

This project proposes a **better approach**:
- Customers first pick a **destination**.
- Immediately see a **calendar view** of available properties for each date.
- This makes it easier to plan travel around actual availability and reduces repetitive searches.

## Features
### Backend (Spring Boot + JPA + REST)
- JPA entities and repositories for users and trades.
- Minimal trade service with DTOs.
- Endpoints for:
    - Adding, deleting, and finding trades.
    - Filtering trades by symbol, type, and date.
    - Retrieving all trades sorted by order.
- User deletion cascades with associated trades.
- Comprehensive test coverage for trade module.

### Frontend (Angular)
- Destination selection interface.
- Calendar component that highlights dates with available properties.
- Real-time integration with backend APIs.
- Clean UI inspired by Agoda's booking flow.
- [Frontend Repository](https://github.com/YourUsername/BookingCalendarBackend)

## Demo Video

[![Watch the demo](https://res.cloudinary.com/ximmoz-corp/image/upload/v1756469985/fe77d91f-172d-4c90-8e32-bc7e9fba1156.png)](https://www.loom.com/share/da76044642f44b6798ecde29e3780fa4)


## Tech Stack
- **Backend:** Spring Boot, JPA, Hibernate, REST APIs, Maven.
- **Frontend:** Angular, TypeScript, HTML, SCSS.
- **Database:** PostgreSQL (configurable).

## Why This Matters
This project demonstrates:
- An improved **user experience** for holiday booking.
- Practical backend engineering skills (REST APIs, persistence, testing).
- Frontend integration for seamless UX.
- A focus on solving **real-world booking pain points**.

## Getting Started
### Prerequisites
- Java 17+
- Node.js 18+
- PostgreSQL

### Backend Setup
```bash
cd backend
./mvnw spring-boot:run
