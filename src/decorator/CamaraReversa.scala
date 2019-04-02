package decorator

class CamaraReversa(carroBase : Carro) extends CarroDecorator(carroBase)
{
      def costo() : Double =
      {  
          _costo = 100000 + _carro.costo()
          return _costo;
      }
  
      def impuestos() : Double =
      {
        _impuestos = 50000 + _carro.impuestos()
         return _impuestos;
      }
      
      def diasEntrega : Int =
      {
          _diasEntrega = 6 + _carro.diasEntrega();
          return _diasEntrega;
      }
}