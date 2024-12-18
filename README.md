# Transporte Público

Este proyecto es una aplicación de Android para gestionar el transporte público, mostrando horarios, rutas y alertas de buses.

## Clases

### `MainActivity`
La actividad principal que actúa como el punto de entrada de la aplicación. Contiene botones para navegar a otras actividades.

#### Métodos importantes:
- `onCreate(Bundle?)`: Inicializa la actividad y configura los listeners para los botones de navegación.

### `MainMenuActivity`
Una actividad que representa el menú principal de la aplicación.

#### Métodos importantes:
- `onCreate(Bundle?)`: Inicializa la actividad y configura la vista del menú principal.

### `HorariosActivity`
Muestra los horarios de los buses en un `Spinner` y un `TextView`.

#### Métodos importantes:
- `onCreate(Bundle?)`: Inicializa la actividad, configura el `Spinner` con los nombres de los buses y muestra el horario seleccionado en el `TextView`.

### `RutasActivity`
Muestra las rutas de los buses en un `ListView`.

#### Métodos importantes:
- `onCreate(Bundle?)`: Inicializa la actividad y configura el `ListView` con las rutas de los buses.

### `AlertasActivity`
Muestra las alertas de los buses en un `ListView` y actualiza el tiempo restante de los buses cada 2 minutos.

#### Métodos importantes:
- `onCreate(Bundle?)`: Inicializa la actividad, configura el `ListView` con las alertas de los buses y comienza a actualizar las alertas cada 2 minutos.
- `startUpdatingBusAlerts()`: Inicia un `Handler` para actualizar las alertas cada 2 minutos.
- `updateBusAlerts()`: Actualiza el tiempo restante de los buses en la lista de alertas.
- `onDestroy()`: Detiene el `Handler` cuando la actividad se destruye.

## Layouts

### `activity_main.xml`
Define la interfaz de usuario para `MainActivity` con botones para navegar a otras actividades.

### `activity_main_menu.xml`
Define la interfaz de usuario para `MainMenuActivity`.

### `activity_horarios.xml`
Define la interfaz de usuario para `HorariosActivity` con un `Spinner` y un `TextView`.

### `activity_rutas.xml`
Define la interfaz de usuario para `RutasActivity` con un `ListView`.

### `activity_alertas.xml`
Define la interfaz de usuario para `AlertasActivity` con un `ListView` y un botón para volver a la actividad principal.

URL: https://github.com/inesgmz/TransportePublico1.git
