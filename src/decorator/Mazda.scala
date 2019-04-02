package decorator

class Mazda extends Carro
{  
    def costo() : Double =
    {
        _costo = 40000000
        return _costo;
    }

    def impuestos() : Double =
    {
      _impuestos = 350000
       return _impuestos;
    }
    
    def diasEntrega : Int =
    {
        _diasEntrega = 20;
        return _diasEntrega;
    }
}