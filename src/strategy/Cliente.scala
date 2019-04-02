package strategy

object Cliente 
{
     def main(args: Array[String]): Unit = 
     {
         //Cambio 1
         var tiendaCambio = new ChangeContext(new CambioDolarStrategy())
         println(tiendaCambio.ejecutarCambio(5000000))
         println(tiendaCambio.calcularImpuestos())
         
         //Cambio 2
         var tiendaCambio2 = new ChangeContext(new CambioLibraEsterlinaStrategy())
         println(tiendaCambio2.ejecutarCambio(5000000))
         println(tiendaCambio2.calcularImpuestos())
         
         //Cambio 3
         var tiendaCambio3 = new ChangeContext(new CambioEuroStrategy())
         println(tiendaCambio3.ejecutarCambio(5000000))
         println(tiendaCambio3.calcularImpuestos())
         
     }
}