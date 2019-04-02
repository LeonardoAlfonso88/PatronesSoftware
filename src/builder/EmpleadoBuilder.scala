package builder

trait EmpleadoBuilder 
{
    protected var empleado : Empleado = _;
  
    def datosBasicosEmpleado(nombreEmpleado : String, edadEmpleado : Int) : Unit
    def crearEmail() : Unit
    def crearPlanSalud() : Unit
    def crearDepartamento() : Unit
    def asignarSueldo() : Unit
    def getEmpleado() : Empleado
}