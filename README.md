# Big Complication — WearOS Watch Face

A minimal, **elderly-friendly** watch face for Wear OS 4+ (API 33+) built with the **Watch Face Format (WFF v2)**.

## Design Philosophy
- **Maximum readability** — 96px bold time dominates the center-top
- **Minimal cognitive load** — One complication, no configuration options, no distractions
- **Full-screen tap** — Touch anywhere on the screen to trigger the complication (no aiming required)
- **Date always visible** — Day-of-week + date shown below the time for temporal orientation
- **High contrast** — Pure white text on OLED black, warm amber accents
- **Battery efficient** — Pure black OLED background, declarative WFF (no code)

## Layout
```
┌─────────────────────┐
│                     │
│       10:08         │  ← 96px BOLD, white
│    Wed, 21 May      │  ← 28px, amber
│                     │
│      Steps          │  ← Complication title (amber)
│      4,231          │  ← Complication value (white)
│                     │
│  [FULL SCREEN TAP]  │  ← Invisible, touch anywhere
└─────────────────────┘
```

## Supported Complication Types
| Type | Use Case |
|------|----------|
| `SHORT_TEXT` | Step count, battery %, timer (default: steps) |
| `LONG_TEXT` | Weather forecasts, calendar events |
| `RANGED_VALUE` | Step goals, heart rate zones |
| `MONOCHROMATIC_IMAGE` | App shortcuts, status icons |
| `SMALL_IMAGE` | Contact photos, app icons |
| `PHOTO_IMAGE` | Personal photos |

## Elderly Setup Guide

### Suppressing Notifications & System Indicators

The Watch Face Format cannot suppress system-level indicators (notification dots, connection popups, DND icons). These must be configured at the system level.

#### On the Watch (Settings)

1. **Enable Do Not Disturb permanently:**
   - Settings → Sound & vibration → Do Not Disturb → Turn on
   - Set schedule to "Always" if available, or enable manually

2. **Disable notification indicators:**
   - Settings → Notifications → Toggle off "Notification dot" / "Notification indicator"

3. **Disable connection alerts:**
   - Settings → Connections → Bluetooth → Disable "Connection alerts"
   - Settings → Connections → Wi-Fi → Disable "Auto reconnect" popups

#### Via ADB (for caregivers)
```bash
# Enable DND permanently
adb shell settings put global zen_mode 2

# Suppress notification dots
adb shell settings put secure notification_badging 0

# Disable connection lost toast
adb shell settings put global bluetooth_disabled_profiles 0
```

#### Via Wear OS Companion App (Phone)
1. Open the Wear OS app on the paired phone
2. Go to **Notifications** → Disable notification mirroring for all non-essential apps
3. Keep only critical apps (phone calls, medical alerts)

### Recommended System Settings for Elderly
- **Display → Always-on display:** ON (so the time is always visible)
- **Display → Font size:** Large or Extra Large
- **Display → Brightness:** Maximum or Auto
- **Accessibility → Touch sensitivity:** Increase if using a screen protector
- **Sound → Touch sounds:** OFF (reduces confusion)

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
