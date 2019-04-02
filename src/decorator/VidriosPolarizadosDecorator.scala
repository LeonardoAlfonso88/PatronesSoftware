package decorator

class VidriosPolarizadosDecorator(carroBase : Carro) extends CarroDecorator(carroBase)
{
      def costo() : Double =
      {  
          _costo = 200000 + _carro.costo()
          return _costo;
      }
  
      def impuestos() : Double =
      {
        _impuestos = 60000 + _carro.impuestos()
         return _impuestos;
      }
      
      def diasEntrega : Int =
      {
          _diasEntrega = 5 + _carro.diasEntrega();
          return _diasEntrega;
      }
}