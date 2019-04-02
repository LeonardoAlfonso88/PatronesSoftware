package builder

class RecursosHumanosDirector(empleadoBuilder : EmpleadoBuilder)
{
    private var _empleadoBuilder = empleadoBuilder
    
    def construirEmpleado(nombreEmpleado : String, edadEmpleado : Int) : Unit =
    {
        _empleadoBuilder.datosBasicosEmpleado(nombreEmpleado, edadEmpleado)
        _empleadoBuilder.crearEmail()
        _empleadoBuilder.crearPlanSalud()
        _empleadoBuilder.crearDepartamento()
        _empleadoBuilder.asignarSueldo()
    }
    
    def getEmpleado() : Empleado = 
    {
        return _empleadoBuilder.getEmpleado()
    }
}