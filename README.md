# Proyecto

Tienda de Relojes Java v1.0 

## Requisitos
- JDK 21+
- Eclipse IDE 2024

## Cómo abrir el proyecto
1. Clonar: `git git@github.com:cmmpk/Project-Java-WatchStore.git`
2. Eclipse → File → Import → General → Existing Projects into Workspace
3. Seleccionar la carpeta clonada

## Estructura del proyecto
- `src/` - código fuente

## Convenciones del proyecto

### Uso de ramas

| Rama | Propósito |
|---|---|
| `main` | código estable y funcional, solo recibe merges aprobados |
| `dev` | rama de desarrollo general, aquí se integran las features |
| `feature/nombre` | nueva funcionalidad, sale de `dev` y regresa a `dev` |
| `fix/nombre` | corrección de un bug, sale de `dev` y regresa a `dev` |

### Flujo de trabajo
1. Crear rama desde `dev`: `git checkout -b feature/mi-funcionalidad`
2. Trabajar y commitear en esa rama
3. Subir la rama: `git push origin feature/mi-funcionalidad`
4. Hacer Pull Request hacia `dev` en GitHub
5. Un compañero revisa y aprueba el merge
6. Cuando `dev` está estable se fusiona a `main`

### ¿Qué se sube al repo?
- ✅ Código fuente (`/src`)
- ✅ Recursos de UI: iconos y fondos (PNG/JPG menores a 500kb)
- ❌ Videos o audio
- ❌ Archivos generados por Eclipse (.classpath, .project, bin/)
- ❌ Imágenes pesadas o assets de diseño (.psd, .ai)

### Mensajes de commit
- `feat:` nueva funcionalidad
- `fix:` corrección de bug
- `chore:` configuración o mantenimiento
- `docs:` documentación