# Mirasta Gaming Platform Documentation

## Overview

Mirasta is a Social Multiplayer Gaming Platform inspired by social gaming products such as Plato. It is not a single game. The goal is to build a reusable platform layer where multiple games can run on top of a shared social infrastructure.

Core principle:

```
Social Core First -> Game Ecosystem Later
```

The MVP validates:

- User authentication
- Session management
- Social rooms
- Presence
- Realtime communication

---

# High Level Architecture

```
Android App (Kotlin + Jetpack Compose)
              |
              v
       Nakama Android Client
              |
              v
          Nakama Server
              |
      +-------+-------+
      |               |
      v               v
 PostgreSQL       Nakama Runtime
 Database         (future game logic)
```

---

# Main Components

## Android Application

Responsibilities:

- UI rendering
- User interaction
- State management
- Calling domain use cases
- Receiving realtime events

Technology:

- Kotlin
- Jetpack Compose
- ViewModel
- StateFlow

Structure:

```
feature/
 ├── auth
 ├── home
 ├── room
 └── chat
```

---

# Domain Layer

Contains business rules without dependency on Nakama.

```
domain/
 ├── auth
 ├── room
 └── chat
```

Examples:

- LoginUseCase
- JoinRoomUseCase
- LeaveRoomUseCase
- SendMessageUseCase

---

# Data Layer

Responsible for connecting domain logic to external systems.

```
data/
 ├── auth
 ├── room
 └── chat
```

Responsibilities:

- Repository implementations
- Remote data sources
- Data mapping

---

# Nakama Backend

Nakama is the core multiplayer backend.

Responsibilities:

## Authentication

- Login
- Session
- User identity
- Profiles

## Realtime

- Socket connection
- Presence
- Chat
- Events

## Match / Room System

- Create room
- Join room
- Leave room
- Player list
- Room metadata

## Runtime

Reserved for future:

- Game rules
- Validation
- Anti cheat
- Server authoritative logic

---

# MVP Flow

```
User
 |
Login
 |
Session Created
 |
Home
 |
Create / Join Room
 |
Presence Updates
 |
Realtime Chat
 |
Leave Room
```

---

# Current MVP Scope

Implemented architecture targets:

- Login Layer
- Session Layer
- Home Layer
- Room Layer
- Presence Model
- Chat Model

Not included in MVP:

- Friends
- Voice Chat
- Matchmaking
- AI
- Game Plugins
- Platform SDK

---

# Future Platform Architecture

Future games will become independent modules:

```
Mirasta Platform
 |
 +-- Social Core
 |
 +-- Ludo Module
 |
 +-- Chess Module
 |
 +-- Carrom Module
 |
 +-- More Games
```

Each game can use:

- Nakama Match
- Realtime Socket
- Shared User System
- Shared Social Features

---

# Repository Structure

```
android/
 ├── core/
 │    ├── model
 │    ├── network
 │    └── common
 │
 ├── data/
 │    ├── auth
 │    ├── room
 │    └── chat
 │
 ├── domain/
 │    ├── auth
 │    ├── room
 │    └── chat
 │
 └── feature/
      ├── auth
      ├── home
      ├── room
      └── chat
```

---

# Development Roadmap

## Phase 1 - Social Core

- Authentication
- Session
- Room
- Presence
- Chat

## Phase 2 - Platform Features

- Friends
- Profiles
- Notifications
- Social Graph

## Phase 3 - Gaming Platform

- Game Modules
- Matchmaking
- Voice
- AI Services
- Developer SDK

---

# Architecture Reference Image

The visual architecture diagram is maintained as the reference design for the Nakama-centered platform architecture.
