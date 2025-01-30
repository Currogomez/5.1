fun main() {
    // Crear un curso

    val cursoKotlin = Curso("Programación en Kotlin", "KOT-101")

    // Crear estudiantes

    val estudiante1 = Estudiante("Carlos Pérez", "12345678A")
    val estudiante2 = Estudiante("María López", "87654321B")

    //  Inscribir a los estudiantes al curso

    estudiante1.inscribirse(cursoKotlin)
    estudiante2.inscribirse(cursoKotlin)

    //  Mostrar la lista de estudiantes inscritos

    cursoKotlin.mostrarEstudiantes()
}