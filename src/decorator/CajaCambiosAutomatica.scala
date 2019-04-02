package decorator

class CajaCambiosAutomatica(carroBase : Carro) extends CarroDecorator(carroBase)
{
      def costo() : Double =
      {  
          _costo = 500000 + _carro.costo()
          return _costo;
      }
  
      def impuestos() : Double =
      {
        _impuestos = 200000 + _carro.impuestos()
         return _impuestos;
      }
      
      def diasEntrega : Int =
      {
          _diasEntrega = 8 + _carro.diasEntrega();
          return _diasEntrega;
      }
}