package decorator

abstract class Carro 
{
    //Atributos
    protected var _costo : Double = _ 
    protected var _impuestos : Double = _
    protected var _diasEntrega : Int = _
    
    //Metodos
    def costo() : Double
    def impuestos() : Double
    def diasEntrega() : Int
}