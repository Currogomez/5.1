// curso, con su nombre, código y lista de estudiantes inscritos.

class Curso(val nombre: String, val codigo: String) {
    private val estudiantes: MutableList<Estudiante> = mutableListOf() // Lista de estudiantes, vacía al inicio

    // Método para meter un estudiante en el curso.

    fun agregarAlumno(estudiante: Estudiante) {
        estudiantes.add(estudiante) // Agregamos el estudiante a la lista
        println("✅ ${estudiante.nombre} se inscribió en el curso $nombre.")
    }

    // Método para mostrar a los estudiantes inscritos.

    fun mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            println("🚨 No hay nadie inscrito en el curso $nombre.")
        } else {
            println("📚 Estudiantes en el curso $nombre:")
            estudiantes.forEach { println("- ${it.nombre} (DNI: ${it.dni})") } // Listamos los inscritos
        }
    }
}

// Clase que representa a un estudiante con su nombre y DNI.

class Estudiante(val nombre: String, val dni: String) {

    // Método para inscribirse en un curso.

    fun inscribirse(curso: Curso) {
        curso.agregarAlumno(this) // El estudiante se inscribe llamando al método del curso
    }
}