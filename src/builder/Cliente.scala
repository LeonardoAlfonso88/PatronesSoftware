package builder

object Cliente {
     def main(args: Array[String]): Unit = {
         
       var auxiliarContable = new AuxiliarContableBuilder()
       var desarrollador = new DesarrolladorBuilder()
       
       //Crear Auxiliar Contable
       var directorRecursosHumanos = new RecursosHumanosDirector(auxiliarContable)
       directorRecursosHumanos.construirEmpleado("Leonardo", 31)
       var empleado = directorRecursosHumanos.getEmpleado()
       println(empleado.nombre)
       println(empleado.edad)
       println(empleado.sueldo)
       println(empleado.getDepartamento())
       
       //Crear Desarrollador
//       var directorRecursosHumanos = new RecursosHumanosDirector(desarrollador)
//       directorRecursosHumanos.construirEmpleado("Roberto", 45)
//       var empleado = directorRecursosHumanos.getEmpleado()
//       println(empleado.nombre)
//       println(empleado.edad)
//       println(empleado.sueldo)
//       println(empleado.getDepartamento())

   }
}