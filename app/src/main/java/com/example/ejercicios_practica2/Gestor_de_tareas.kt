package com.example.ejercicios_practica2

fun List<String>.pendientes(): List<String> {
    return this.filter { !it.startsWith("[X]") }
}

fun main(){
    val tareas = mutableListOf<String>()

    println("Bienvenido al Gestor de tareas")
    println("Pulsa 1 para añadir una tarea")
    println("Pulsa 2 para eliminar una tarea")
    println("pulsa 3 para marcar como completada una tarea")
    println("pulsa 4 para ver las tareas pendientes")
    println("pulsa 5 para salir")
    print("Opción: ")
    var resp = readLine()

    when (resp) {
        "1" -> {
            print("Escribe la tarea: ")
            val nuevaTarea = readLine() ?: ""
            if (nuevaTarea.isNotEmpty()) {
                tareas.add(nuevaTarea.trim())
                println("Tarea añadida con éxito.")
            }
        }
        "2" -> {
            if (tareas.isEmpty()) {
                println("No hay tareas para eliminar.")
            } else {
                print("Introduce el número de la tarea a eliminar (1 a ${tareas.size}): ")
                val indice = (readLine()?.toIntOrNull() ?: 0) - 1
                if (indice in 0 until tareas.size) {
                    tareas.removeAt(indice)
                    println("Tarea eliminada correctamente.")
                } else {
                    println("Número de tarea no válido.")
                }
            }
        }
        "3" -> {
            if (tareas.isEmpty()) {
                println("No hay tareas para completar.")
            } else {
                print("Introduce el número de la tarea completada (1 a ${tareas.size}): ")
                val indice = (readLine()?.toIntOrNull() ?: 0) - 1
                if (indice in 0 until tareas.size) {
                    tareas[indice] = "[X] ${tareas[indice]}"
                    println("Tarea marcada como completada.")
                } else {
                    println("Número de tarea no válido.")
                }
            }
        }

    }




}