package decorator

class VidriosElectricosDecorator(carroBase : Carro) extends CarroDecorator(carroBase)
{
      def costo() : Double =
      {  
          _costo = 100000 + _carro.costo()
          return _costo;
      }
  
      def impuestos() : Double =
      {
        _impuestos = 10000 + _carro.impuestos()
         return _impuestos;
      }
      
      def diasEntrega : Int =
      {
          _diasEntrega = 4 + _carro.diasEntrega();
          return _diasEntrega;
      }
}