package decorator

class Audi extends Carro 
{
    def costo() : Double =
    {
        _costo = 80000000
        return _costo;
    }

    def impuestos() : Double =
    {
      _impuestos = 800000
       return _impuestos;
    }
    
    def diasEntrega : Int =
    {
        _diasEntrega = 40;
        return _diasEntrega;
    }
}