# Wear OS Max Complications Watch Face

A minimal and efficient watch face for Wear OS 4+ (API Level 33+) designed using the **Watch Face Format (WFF)**.

## Features
- **Minimal Time Display:** Small digital clock at the top to maximize screen real estate for information.
- **Maximum Complications:** 8 complication slots (the maximum allowed by the format).
- **Battery Efficient:** Uses a solid black background for OLED screens and the declarative WFF which doesn't require a runtime.
- **Modern Standards:** Built with WFF v2.

## Project Structure
- `res/raw/watchface.xml`: The core declarative UI.
- `AndroidManifest.xml`: Standard Android manifest for a WFF project.

## How to Use
1. **Developer:** Import the `watchface.xml` into a Wear OS project in Android Studio or Watch Face Studio.
2. **Build:** The XML format is supported natively by Wear OS 4+. No Kotlin/Java code is required.

## License
Apache 2.0
