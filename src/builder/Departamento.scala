package builder

class Departamento(departamentoEmpleado : String, puestoEmpleado : String)
{
    //Atributos
    private var _departamento : String = departamentoEmpleado
    private var _puesto : String = puestoEmpleado
    
    //Metodos
      //Getters
      def departamento = _departamento
      def puesto = _puesto
      
      //Setters
      def departamento_(departamento: String) = _departamento = departamento
      def edad_(puesto: String) = _puesto = puesto
}