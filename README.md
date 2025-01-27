This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/),
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


* `Libraries`
  - `Kamel Image` for Async Image loader
    - [Link](https://github.com/Kamel-Media)
  - `Koin` for Dependency Injection
    - [Link](https://insert-koin.io/)
  - `Compose Material and Versions`
    - [Link](https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-compatibility-and-versioning.html)
  - `Ktorfit` a HTTP client/Kotlin Symbol Processor for Kotlin Multiplatform(Very much like `Retrofit`)
    - [Link](https://github.com/Foso/Ktorfit)
  - `Kotlinter` plugin for linting and formatting Kotlin source files using the ktlint engine.
    - [Link](https://github.com/jeremymailen/kotlinter-gradle)
  -  `Voyager` A multiplatform navigation library built for, and seamlessly integrated with, Jetpack Compose.
    - [Link](https://github.com/adrielcafe/voyager)

This sample project serves as a boilerplate for future project use, it is already designed using `Clean Architecture`.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
