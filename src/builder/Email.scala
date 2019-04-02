package builder

class Email(nombreEmpleado: String, dependencia: String)
{
    //Atributos
    private var _nombre : String = _
    private var _dependencia : String = _
    private var _email : String = nombreEmpleado.substring(1,4) + dependencia + "@empresa.com"
  
   //Metodos
    def email = _email
}