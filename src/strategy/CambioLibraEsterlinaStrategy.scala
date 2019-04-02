package strategy

class CambioLibraEsterlinaStrategy extends MoneyChangeStrategy
{
      var _valorLibras : Double = 0
  
      def cambiarMoneda(valor : Double) : Double = 
      {
          _valorLibras = valor / 5000;
          return _valorLibras
      }
      
      def calcularImpuestoCambio() : Double = 
      {
          return _valorLibras * 0.1;
      }
}