package strategy

trait MoneyChangeStrategy 
{
    def cambiarMoneda(valor : Double) : Double 
    def calcularImpuestoCambio() : Double 
}