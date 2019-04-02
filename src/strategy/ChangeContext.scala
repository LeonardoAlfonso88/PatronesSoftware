package strategy

class ChangeContext(cambio : MoneyChangeStrategy)
{
    //Atributos
    private var _tipoCambio : MoneyChangeStrategy = cambio
    
    //Métodos
    def ejecutarCambio(valor : Double) : Double = 
    {
        _tipoCambio.cambiarMoneda(valor)
    }
    
    def calcularImpuestos() : Double =
    {
        return _tipoCambio.calcularImpuestoCambio()
    }
}