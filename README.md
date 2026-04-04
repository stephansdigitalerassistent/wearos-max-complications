# Wear OS Big Complication Watch Face

A minimal and efficient watch face for Wear OS 4+ (API Level 33+) designed using the **Watch Face Format (WFF)**.

## Features
- **Minimal Time Display:** Clean digital clock at the top.
- **Single Large Complication:** One massive `LONG_TEXT` complication slot that takes up the majority of the screen. Perfect for weather, detailed calendar events, or fitness data.
- **Battery Efficient:** Solid black background and declarative WFF.

## Project Structure
- `res/raw/watchface.xml`: The core declarative UI.
- `AndroidManifest.xml`: Standard Android manifest for a WFF project.

## How to Use
1. **Developer:** Import the `watchface.xml` into a Wear OS project in Android Studio or Watch Face Studio.
2. **Build:** The XML format is supported natively by Wear OS 4+. No Kotlin/Java code is required.

## License
Apache 2.0
