package builder

class AuxiliarContableBuilder extends EmpleadoBuilder 
{   
    def datosBasicosEmpleado(nombreEmpleado : String, edadEmpleado : Int)
    {
        empleado = new Empleado(nombreEmpleado, edadEmpleado)
    }
  
    def crearEmail() : Unit = 
    {
        var email = new Email(empleado.nombre, "administrativo")
        empleado.asignarEmail(email)
    }
    
    def crearPlanSalud() : Unit = 
    {
        var planSalud = new PlanSalud()
        planSalud.medicinaPrepagada_(false)
        planSalud.tipoPlan_("Estandar")
        empleado.asignarPlanSalud(planSalud)
    }
    
    def crearDepartamento() : Unit = 
    {
        var departamento = new Departamento("administrativo", "auxiliarContable")
        empleado.asignarDepartamento(departamento)
    }
    
    def asignarSueldo() : Unit = 
    {
        empleado.sueldo_(2000000)
    }
    
    def getEmpleado() : Empleado = 
    {
        return empleado
    }
}