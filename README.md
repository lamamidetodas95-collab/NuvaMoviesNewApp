# 🎬 Nuva Movies - Android TV/Mobile Streaming App

![Version](https://img.shields.io/badge/version-1.0.0-blue)
![Platform](https://img.shields.io/badge/platform-Android-green)
![Language](https://img.shields.io/badge/language-Kotlin-purple)
![Min SDK](https://img.shields.io/badge/minSdk-19-orange)

Una aplicación de streaming moderna y completa para Android TV y dispositivos móviles, construida desde cero con la interfaz visual de XuperHydra4K.

---

## ✨ Características

### 📺 Funcionalidades Principales
- ✅ **Streaming de Video** - Películas, series y TV en vivo
- ✅ **Android TV & Mobile** - Optimizado para ambas plataformas
- ✅ **Interfaz Moderna** - UI/UX completa basada en Material Design
- ✅ **Multi-idioma** - Inglés, Español, Portugués
- ✅ **Tema Oscuro** - Soporte nativo de tema oscuro
- ✅ **ExoPlayer** - Reproductor de video de alta calidad
- ✅ **Firebase** - Analytics, Crashlytics y Push Notifications
- ✅ **Offline Support** - Room Database para caché
- ✅ **Responsive Design** - Múltiples densidades de pantalla

### 🎨 Interfaz Visual
- **Layouts**: 300+ pantallas XML extraídas y listas
- **Drawables**: 1,037 imágenes PNG + 33 WEBP
- **Animations**: Animaciones fluidas y profesionales
- **Styles**: Sistema completo de estilos personalizables
- **Colors**: Paleta de colores cohesiva

---

## 🏗️ Arquitectura del Proyecto

```
NuvaMoviesApp/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/nuva/movies/
│   │       │   ├── NuvaMoviesApplication.kt
│   │       │   ├── ui/
│   │       │   │   ├── activity/
│   │       │   │   │   ├── WelcomeActivity.kt
│   │       │   │   │   ├── HomeActivity.kt
│   │       │   │   │   ├── PlayerActivity.kt
│   │       │   │   │   ├── DetailsActivity.kt
│   │       │   │   │   └── SearchActivity.kt
│   │       │   │   ├── fragment/
│   │       │   │   │   ├── HomeFragment.kt
│   │       │   │   │   ├── MoviesFragment.kt
│   │       │   │   │   ├── SeriesFragment.kt
│   │       │   │   │   ├── LiveTVFragment.kt
│   │       │   │   │   └── ProfileFragment.kt
│   │       │   │   └── adapter/
│   │       │   ├── data/
│   │       │   │   ├── model/
│   │       │   │   └── repository/
│   │       │   ├── service/
│   │       │   └── util/
│   │       ├── res/
│   │       │   ├── layout/          (Todos los layouts de Xuper)
│   │       │   ├── drawable*/       (Todas las imágenes e iconos)
│   │       │   ├── values*/         (Estilos, colores, strings)
│   │       │   ├── anim*/           (Animaciones)
│   │       │   ├── menu/            (Menús)
│   │       │   └── mipmap*/         (Iconos de app)
│   │       └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
└── README.md
```

---

## 🛠️ Tecnologías Utilizadas

### Core
- **Lenguaje**: Kotlin
- **Min SDK**: 19 (Android 4.4)
- **Target SDK**: 33 (Android 13)
- **Build System**: Gradle 8.1.0

### Librerías Principales

#### AndroidX
- AndroidX Core, AppCompat, ConstraintLayout
- Lifecycle, ViewModel, LiveData
- Navigation Component
- RecyclerView, CardView
- Room Database

#### UI/UX
- Material Design 1.9.0
- Glide 4.15.1 (Image Loading)
- Custom Animations

#### Networking
- Retrofit 2.9.0
- OkHttp 4.11.0
- Gson 2.10.1

#### Media
- ExoPlayer 2.19.1 (Video Player)
- ExoPlayer HLS Support

#### Firebase
- Firebase Analytics
- Firebase Crashlytics
- Firebase Cloud Messaging (Push Notifications)

#### Android TV
- Leanback Library 1.0.0

#### Other
- Kotlin Coroutines
- MultiDex
- ProGuard

---

## 🚀 Cómo Empezar

### Prerrequisitos
- Android Studio Hedgehog | 2023.1.1 o superior
- JDK 17
- Android SDK con API 33
- Gradle 8.x

### Instalación

1. **Clonar o abrir el proyecto**
   ```bash
   # Abrir en Android Studio
   File > Open > Seleccionar carpeta "NuvaMoviesApp"
   ```

2. **Sincronizar Gradle**
   ```bash
   # En Android Studio:
   File > Sync Project with Gradle Files
   ```

3. **Configurar Firebase** (Opcional pero recomendado)
   - Ir a [Firebase Console](https://console.firebase.google.com/)
   - Crear nuevo proyecto
   - Agregar app Android con package: `com.nuva.movies`
   - Descargar `google-services.json`
   - Copiar a: `app/google-services.json`

4. **Compilar y Ejecutar**
   ```bash
   # Build > Make Project
   # Run > Run 'app'
   ```

---

## 📱 Cómo Usar la App

### Navegación Principal
1. **Home** - Contenido destacado y recomendaciones
2. **Movies** - Catálogo de películas
3. **Series** - Catálogo de series
4. **Live TV** - Canales en vivo
5. **Profile** - Configuración y perfil de usuario

### Controles Android TV
- **D-Pad** - Navegación
- **OK/Enter** - Seleccionar
- **Back** - Volver
- **Menu** - Opciones adicionales

---

## 🎨 Personalización

### Cambiar Colores
Editar `app/src/main/res/values/colors.xml`:
```xml
<color name="colorPrimary">#TU_COLOR</color>
<color name="colorAccent">#TU_COLOR</color>
```

### Cambiar Estilos
Editar `app/src/main/res/values/styles.xml`:
```xml
<style name="AppTheme" parent="Theme.MaterialComponents.DayNight.NoActionBar">
    <!-- Tus personalizaciones -->
</style>
```

### Cambiar Textos
Editar `app/src/main/res/values/strings.xml`:
```xml
<string name="app_name">Tu Nombre</string>
```

### Cambiar Logo/Iconos
Reemplazar archivos en:
- `app/src/main/res/mipmap-*/icon_app.png`

---

## 📦 Compilar APK

### Debug APK
```bash
./gradlew assembleDebug
# Output: app/build/outputs/apk/debug/app-debug.apk
```

### Release APK (Firmado)
```bash
# 1. Crear keystore
keytool -genkey -v -keystore nuva-movies.keystore -alias nuva -keyalg RSA -keysize 2048 -validity 10000

# 2. Compilar release
./gradlew assembleRelease

# 3. Firmar APK
jarsigner -verbose -sigalg SHA256withRSA -digestalg SHA-256 -keystore nuva-movies.keystore app/build/outputs/apk/release/app-release-unsigned.apk nuva

# 4. Alinear APK
zipalign -v 4 app/build/outputs/apk/release/app-release-unsigned.apk nuva-movies.apk
```

---

## 🐛 Debugging

### Logs
```bash
adb logcat | grep "NuvaMovies"
```

### Crashlytics
Los crashes se reportan automáticamente a Firebase Crashlytics.

### ProGuard Issues
Si tienes problemas con ProGuard, edita `app/proguard-rules.pro`.

---

## 📋 Tareas Pendientes (TODO)

### Backend Integration
- [ ] Integrar API de contenido
- [ ] Implementar sistema de autenticación
- [ ] Agregar manejo de favoritos/watchlist
- [ ] Sincronización de progreso de reproducción

### Features
- [ ] Búsqueda avanzada
- [ ] Filtros y categorías
- [ ] Recomendaciones personalizadas
- [ ] Subtítulos y audio múltiple
- [ ] Download para offline
- [ ] Perfil de múltiples usuarios
- [ ] Control parental

### Optimizations
- [ ] Caché de imágenes mejorado
- [ ] Precarga de contenido
- [ ] Reducir tamaño del APK
- [ ] Optimizar animaciones

---

## 🔒 Seguridad

- ✅ Network Security Config incluido
- ✅ ProGuard configurado
- ✅ Firebase Security Rules (configurar en Firebase Console)
- ✅ API Keys ocultas (usar BuildConfig)
- ⚠️ **IMPORTANTE**: No subir `google-services.json` a repositorios públicos

---

## 📄 Licencia

Este proyecto utiliza la interfaz visual extraída de XuperHydra4K APK.
Todo el código Kotlin es original y de nueva creación.

**Para uso educativo y personal.**

---

## 👥 Contacto

- **Email**: picadocarlos118@gmail.com
- **Email alternativo**: picadoc902@gmail.com

---

## 📚 Recursos Adicionales

### Documentación
- [Android Developers](https://developer.android.com/)
- [Kotlin Docs](https://kotlinlang.org/docs/home.html)
- [ExoPlayer Guide](https://exoplayer.dev/)
- [Firebase Docs](https://firebase.google.com/docs)

### Herramientas Recomendadas
- Android Studio
- Postman (API Testing)
- Firebase Console
- APK Analyzer

---

## 🎉 ¡Proyecto Listo!

El proyecto está completamente configurado y listo para:
1. ✅ Abrir en Android Studio
2. ✅ Compilar y ejecutar
3. ✅ Personalizar y extender
4. ✅ Agregar tu backend API
5. ✅ Publicar en Play Store

**¡Happy Coding! 🚀**
