package builder

class Empleado(nombreEmpleado : String, edadEmpleado : Int)
{
    //Atributos
    private var _nombre : String = nombreEmpleado 
    private var _edad : Int = edadEmpleado
    private var _planSalud : PlanSalud = _
    private var _email : Email = _
    private var _departamento : Departamento = _
    private var _sueldo : Double = _
  
   //Metodos
    //Getters
    def nombre = _nombre
    def edad = _edad
    def sueldo = _sueldo
    
    //Setters
    def nombre_(nombre: String) = _nombre = nombre
    def edad_(edad: Int) = _edad = edad
    def sueldo_(sueldo : Double) = _sueldo = sueldo
    
    //Acciones
    def asignarEmail(email : Email)
    {
        _email = email
    }
    
    def asignarPlanSalud(plan : PlanSalud)
    {
        _planSalud = plan
    }
    
    def asignarDepartamento(departamento : Departamento)
    {
        _departamento = departamento
    }
    
    def getDepartamento() : String = _departamento.departamento
}