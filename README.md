# 🚗 Proyecto Vehículo - EndTerm M05
**Asignatura:** Entornos de Desarrollo  
**Ciclo:** DAW  
**Grupo:** EndTerm-M05-Grupo_02  

## 📌 Descripción
Este proyecto forma parte del trabajo final de la asignatura **Entornos de Desarrollo**.

## 👥 Equipo
- Pablo Nicolás García  
- Pablo Nuñez Pastrana
- Gabriel de Luque Ramis de Ayreflor

## 🎯 Objetivo de esta fase
Definir el comportamiento esperado de la clase `Vehiculo` antes de su implementación.

# 🧩 Clase principal vehículo


## 📦 Requisitos funcionales

### Atributos

- `marca` (String)
- `modelo` (String)
- `velocidadActual` (int)
- `velocidadMaxima` (int)

### Métodos

#### 🚀 acelerar(int incremento)

- aumenta la velocidad actual
- no puede superar la velocidad máxima

#### 🛑 frenar(int decremento)

- reduce la velocidad actual
- no puede bajar de 0

## 📏 Reglas de negocio

- velocidad inicial = 0
- no puede ser negativa
- no puede superar velocidad máxima

## 🧪 Casos de uso

- acelerar desde 0 → aumenta correctamente
- acelerar superando límite → se queda en máximo
- frenar → reduce correctamente
- frenar por debajo de 0 → se queda en 0

## 🛠️ Tecnologías

- Java
- Maven
- JUnit 5
- Git + GitHub
- IntelliJ



