
# GameRadar

**GameRadar** is a modern Android application designed to help users stay up to date with the latest news, trends, and developments in the gaming world. Whether you're interested in upcoming game releases, industry news, or updates from your favorite titles, GameRadar provides a streamlined and user-friendly experience to access this information in one place. The app aggregates reliable sources and presents them through a clean interface, making it easier for gaming enthusiasts to discover and follow the most relevant updates without getting overwhelmed. Built with performance and maintainability in mind, GameRadar leverages modern Android development tools and architectural patterns to ensure a seamless experience across a wide range of devices.

![untitled (online-video-cutter com) (1)](https://github.com/user-attachments/assets/d0cf19fa-ae6e-40e4-8677-4e53b9a38380)


## Architecture

The project is built following **Clean Architecture** principles and is divided into three main layers:

* **Presentation**: UI components, ViewModels, and UI state management
* **Domain**: Business logic, use cases, and domain models
* **Data**: Data sources, repository implementations, and network layer

## Technologies and Libraries Used

### Core Technologies

* Kotlin
* Android SDK
* Gradle (Kotlin DSL)

### Architecture and Dependency Injection

* Dagger Hilt (Dependency Injection)
* AndroidX Navigation Component
* ViewModel and LiveData
* DataBinding and ViewBinding

### AndroidX Components

* Core KTX
* AppCompat
* Lifecycle Components
* WorkManager
* Startup Runtime
* ConstraintLayout
* Navigation Component

### Build and Development Tools

* Android Gradle Plugin
* Kotlin Android Plugin
* Kotlin Kapt
* R8 Proguard

## Project Structure

```
GameRadar/
├── app/                    # Main application module
├── presentation/           # UI layer
├── domain/                 # Domain/business logic layer
├── data/                   # Data layer
└── buildSrc/               # Gradle configuration module
```

## Development Environment Requirements

* Android Studio Arctic Fox or higher
* JDK 17
* Android SDK 33 or higher
* Gradle 7.0 or higher

## Setup

1. Clone the repository
2. Open it with Android Studio
3. Complete the Gradle sync
4. Run the application
