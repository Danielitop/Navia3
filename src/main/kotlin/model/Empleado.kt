package model

// Clase Empleado
data class Empleado(
    val nombre: String,
    val edad: Int,
    val salario: Double,
    val departamento: String
)

// Lista de empleados (ejemplo de 15)
val empleados = listOf(
    Empleado("Ana", 28, 2500.0, "Ventas"),
    Empleado("Luis", 35, 3200.0, "Ventas"),
    Empleado("Carlos", 40, 4000.0, "Ventas"),
    Empleado("Marta", 31, 3100.0, "TI"),
    Empleado("José", 29, 2800.0, "TI"),
    Empleado("Elena", 33, 3500.0, "TI"),
    Empleado("Pedro", 45, 4200.0, "Finanzas"),
    Empleado("Lucía", 38, 3900.0, "Finanzas"),
    Empleado("Andrés", 27, 2600.0, "Finanzas"),
    Empleado("Sofía", 42, 4100.0, "Recursos Humanos"),
    Empleado("Raúl", 36, 3700.0, "Recursos Humanos"),
    Empleado("Clara", 25, 2400.0, "Recursos Humanos"),
    Empleado("Diego", 34, 3300.0, "Marketing"),
    Empleado("Valeria", 39, 3950.0, "Marketing"),
    Empleado("Javier", 41, 4050.0, "Marketing")
)
