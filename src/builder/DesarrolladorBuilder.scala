package builder

class DesarrolladorBuilder extends EmpleadoBuilder
{
    def datosBasicosEmpleado(nombreEmpleado : String, edadEmpleado : Int)
    {
        empleado = new Empleado(nombreEmpleado, edadEmpleado)
    }
  
    def crearEmail() : Unit = 
    {
        var email = new Email(empleado.nombre, "sistemas")
        empleado.asignarEmail(email)
    }
    
    def crearPlanSalud() : Unit = 
    {
        var planSalud = new PlanSalud()
        planSalud.medicinaPrepagada_(true)
        planSalud.tipoPlan_("Premium")
        empleado.asignarPlanSalud(planSalud)
    }
    
    def crearDepartamento() : Unit = 
    {
        var departamento = new Departamento("sistemas", "Desarrollador")
        empleado.asignarDepartamento(departamento)
    }
    
    def asignarSueldo() : Unit = 
    {
        empleado.sueldo_(3000000)
    }
    
    def getEmpleado() : Empleado = 
    {
        return empleado
    }
}