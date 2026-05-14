# Big Complication — WearOS Watch Face

A minimal, **elderly-friendly** watch face for Wear OS 4+ (API 33+) built with the **Watch Face Format (WFF v2)**.

## Design Philosophy
- **ONE complication, MAXIMUM space** — The single complication slot fills ~80% of the screen
- **Elderly-friendly colors** — Warm white & amber tones (no blue/cyan), high contrast on pure black
- **Large text** — 24–60px font sizes for easy readability
- **Battery efficient** — Pure black OLED background, declarative WFF (no code)

## Supported Complication Types
| Type | Use Case |
|------|----------|
| `LONG_TEXT` | Weather forecasts, calendar events, detailed info |
| `SHORT_TEXT` | Step count, battery %, timer |
| `RANGED_VALUE` | Step goals, heart rate zones (with progress arc) |
| `MONOCHROMATIC_IMAGE` | App shortcuts, status icons |
| `SMALL_IMAGE` | Contact photos, app icons |
| `PHOTO_IMAGE` | Personal photos, album art |

## Project Structure
- `app/src/main/res/raw/watchface.xml` — Core declarative watch face UI
- `app/src/main/AndroidManifest.xml` — WFF v2 service declaration
- `app/src/main/res/drawable/preview.png` — Watch face preview image
- `app/src/main/res/mipmap*/ic_launcher.png` — Density-specific launcher icons

## Google Play Store Compliance
- ✅ `targetSdk = 35` (required ≥ 34 since Aug 2025)
- ✅ `minSdk = 33` (Wear OS 4+)
- ✅ WFF v2 format (mandatory since Jan 2026)
- ✅ Density-specific launcher icons (mdpi through xxxhdpi)
- ✅ Preview images for circular watch faces
- ✅ `supportsRtl = true`
- ✅ No code dependencies (pure declarative XML)

## How to Build
```bash
./gradlew assembleDebug    # Debug APK
./gradlew assembleRelease  # Release APK (needs signing config)
```

## License
Apache 2.0
