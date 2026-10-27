# 📐 Aplicación de Figuras Geométricas en Java Swing

Repositorio académico correspondiente al desarrollo de prácticas de programación orientada a objetos en Java.

## 👤 Información del Estudiante y Curso
* **Estudiante:** Samuel David Yepes Zambrano
* **Institución:** Universidad Nacional de Colombia - Sede Medellín
* **Facultad:** Facultad de Minas
* **Programa:** Ingeniería de Sistemas e Informática
* **Curso / Asignatura:** Programación Orientada a Objetos (Semestre 2026-2)
* * **Profesor:** Walter Arboleda 

---

## 📋 Descripción del Proyecto
Aplicación de escritorio desarrollada en Java utilizando la librería gráfica **Swing**. El software implementa los principios de la Programación Orientada a Objetos (POO) para calcular de manera interactiva las propiedades geométricas —específicamente el volumen y la superficie— de diversas figuras tridimensionales mediante un menú de navegación principal y ventanas especializadas para cada figura.

---

## ⚙️ Características Técnicas y Arquitectura

* **Jerarquía de Clases:** Estructura modular basada en una clase padre para figuras geométricas y subclases especializadas (`Cubo`, `Cilindro`, `Esfera`, `Pirámide`, `Prisma`).
* **Validación de Entradas:** Implementación rigurosa de bloques `try-catch-finally` con indicadores de error (`boolean error`) para el manejo de excepciones numéricas (`NumberFormatException`), notificando al usuario mediante cuadros de diálogo de error (`JOptionPane.ERROR_MESSAGE`).
* **Adaptabilidad Numérica:** Soporte para la lectura de valores con comas o puntos decimales mediante el reemplazo de caracteres (`.replace(',', '.')`).
* **Formato de Salida:** Presentación de resultados numéricos estandarizados a dos cifras decimales empleando `String.format("%.2f", ...)`.
* **Interfaz Gráfica de Usuario (GUI):** Ventanas configuradas con dimensiones fijas (`setResizable(false)`), posicionamiento centralizado y renderizado de componentes visuales asociados a cada entidad geométrica.
