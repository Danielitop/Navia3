
import model.empleados

fun main() {
    // 3. Filtrar los mayores de 30 años
    val mayores30 = empleados.filter { it.edad > 30 }

    // 4. Agrupar por departamento
    val agrupados = mayores30.groupBy { it.departamento }

    // 5. Calcular salario promedio por departamento
    val promedioPorDepto = agrupados.mapValues { entry ->
        entry.value.map { it.salario }.average()
    }

    // 6. Convertir la lista en un mapa nombre → salario
    val nombreSalario = empleados.associate { it.nombre to it.salario }

    // Mostrar resultados
    println(" Empleados mayores de 30:")
    mayores30.forEach { println(it) }

    println("\n Agrupados por departamento:")
    agrupados.forEach { (depto, lista) ->
        println("$depto -> $lista")
    }

    println("\n Salario promedio por departamento:")
    promedioPorDepto.forEach { (depto, promedio) ->
        println("$depto -> $promedio")
    }

    println("\n️ Mapa nombre → salario:")
    println(nombreSalario)
}


