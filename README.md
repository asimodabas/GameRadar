
# GameRadar

**GameRadar** is a modern Android application designed to help users stay up to date with the latest news, trends, and developments in the gaming world. Whether you're interested in upcoming game releases, industry news, or updates from your favorite titles, GameRadar provides a streamlined and user-friendly experience to access this information in one place. The app aggregates reliable sources and presents them through a clean interface, making it easier for gaming enthusiasts to discover and follow the most relevant updates without getting overwhelmed. Built with performance and maintainability in mind, GameRadar leverages modern Android development tools and architectural patterns to ensure a seamless experience across a wide range of devices.

| Games | Game Detail | Wishlist |
| ------- | -------------------- | -------------------- |
|<img src="https://github.com/user-attachments/assets/ce17890d-a5b3-43f6-beb0-1473c1d8d98f"/>|<img src="https://github.com/user-attachments/assets/774edaff-e752-4cfe-91d5-d37d26157d39"/>|<img src="https://github.com/user-attachments/assets/208f4eee-06e8-4421-8918-7fba60e9f3b1"/>|

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

* [Dagger Hilt (Dependency Injection)][1] - Hilt is a dependency injection library for Android that reduces the boilerplate of doing manual dependency injection in your project. Doing manual dependency injection requires you to construct every class and its dependencies by hand, and to use containers to reuse and manage dependencies.
* [AndroidX Navigation Component][2] - Navigation refers to the interactions that let users navigate across, into, and back out from the different pieces of content within your app.
* [ViewModel and LiveData][3] - LiveData is an observable data holder class. Unlike a regular observable, LiveData is lifecycle-aware, meaning it respects the lifecycle of other app components, such as activities, fragments, or services. This awareness ensures LiveData only updates app component observers that are in an active lifecycle state.
* [DataBinding and ViewBinding][4] - View binding is a feature that makes it easier to write code that interacts with views. Once view binding is enabled in a module, it generates a binding class for each XML layout file present in that module. An instance of a binding class contains direct references to all views that have an ID in the corresponding layout.

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

## MIT License

Copyright (c) 2025 Asım Odabaş

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

[1]: https://developer.android.com/training/dependency-injection/hilt-android
[2]: https://developer.android.com/guide/navigation
[3]: https://developer.android.com/topic/libraries/architecture/livedata
[4]: https://developer.android.com/topic/libraries/view-binding

