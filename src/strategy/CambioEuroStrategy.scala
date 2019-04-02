package strategy

class CambioEuroStrategy extends MoneyChangeStrategy
{
      var _valorEuros : Double = 0
  
      def cambiarMoneda(valor : Double) : Double = 
      {
          _valorEuros = valor / 3700;
          return _valorEuros
      }
      
      def calcularImpuestoCambio() : Double = 
      {
          return _valorEuros * 0.08;
      }
}