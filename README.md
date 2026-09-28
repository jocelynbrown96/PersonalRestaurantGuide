# Personal Restaurant Guide

**COMP3074 — Mobile Application Development I · Final Project · Team 82**

A native Android app for keeping your own personal restaurant guide: save the spots you
love, find them on a map, and share them with friends!

## Team:

| Name              | Student ID | Role                               |
| ----------------- | ---------- | ---------------------------------- |
| Mackenzie Hodgson | 101597352  | UI/UX Developer                    |
| Jocelyn Brown     | 101597391  | Project Manager/Back-End Developer |

## Screens:

| Screen             | Purpose                                                   |
| ------------------ | --------------------------------------------------------- |
| Home               | List of saved restaurants, search bar, bottom navigation. |
| Add a Restaurant   | Form: name, address, phone, tags, rating.                 |
| Restaurant Details | View / edit / delete, view on map, directions, share.     |
| Map                | Pins for all saved restaurants — tap a pin for details.   |
| About              | Creator and project info.                                 |

## Tech Stack:

- Android Studio · Kotlin · Android Views
- minSdk 24 (Android 7.0) · targetSdk 34
- Room (local database) · Google Maps Platform · Material 3

## Setup:

1. Clone the repo.
2. Copy `local.properties.example` to `local.properties` and add your Google Maps API key:
   `MAPS_API_KEY=your_key_here`
   (`local.properties` is gitignored — never commit a key.)
3. Open the project folder in Android Studio. It downloads Gradle and syncs on first open.
4. Run on an emulator or device (Maps needs Google Play Services).

## Project Structure:

```
app/src/main/
├── AndroidManifest.xml
├── java/com/example/personalrestaurantguide/
│   ├── MainActivity.kt              # Home Screen
│   ├── AddRestaurantActivity.kt     # Add Form
│   ├── RestaurantDetailActivity.kt  # Details / Edit / Delete
│   ├── MapActivity.kt               # Map with pins
│   ├── AboutActivity.kt             # About Screen
│   ├── data/
│   │   ├── Restaurant.kt            # Room Entity
│   │   ├── RestaurantDao.kt         # Queries
│   │   └── AppDatabase.kt           # Room database singleton
│   └── repository/
│       └── RestaurantRepository.kt  # UI-facing Data Access
└── res/
    ├── layout/                      # One layout per screen
    ├── menu/bottom_nav_menu.xml     # Persistent bottom navigation
    └── values/                      # Strings, Colors, Theme
```

## References

- Proposal: COMP3074 Final Project Design Proposal (Team 82)
