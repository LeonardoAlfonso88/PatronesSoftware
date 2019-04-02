package strategy

class CambioDolarStrategy extends MoneyChangeStrategy
{
    var _valorDolar : Double = 0
  
    def cambiarMoneda(valor : Double) : Double = 
    {
        _valorDolar = valor / 3200;
        return _valorDolar
    }
    
    def calcularImpuestoCambio() : Double = 
    {
        return _valorDolar * 0.05;
    }
}