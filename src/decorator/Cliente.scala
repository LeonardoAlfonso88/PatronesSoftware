package decorator

object Cliente 
{
     def main(args: Array[String]): Unit = {
    //Carro 1
    var carro : Mazda = new Mazda()
    var carroMejorado : CarroDecorator = new CamaraReversa(carro)
    carroMejorado = new CajaCambiosAutomatica(carroMejorado)
    carroMejorado = new VidriosElectricosDecorator(carroMejorado)
    
     println(carroMejorado.costo())
     println(carroMejorado.impuestos())
     println(carroMejorado.diasEntrega())
  
    //Carro 2
    var carro2 : Carro = new Audi()
    var carroMejorado2 : CarroDecorator = new CamaraReversa(carro2)
    carroMejorado2 = new CajaCambiosAutomatica(carroMejorado2)
    carroMejorado2 = new VidriosElectricosDecorator(carroMejorado2)
    
     println(carroMejorado2.costo())
     println(carroMejorado2.impuestos())
     println(carroMejorado2.diasEntrega())
  
    //Carro 3
    var carro3 : Carro = new Mazda()
    var carroMejorado3 : CarroDecorator = new CamaraReversa(carro3)
    carroMejorado3 = new CajaCambiosAutomatica(carroMejorado3)
    carroMejorado3 = new VidriosElectricosDecorator(carroMejorado3)
    carroMejorado3 = new VidriosPolarizadosDecorator(carroMejorado3)
    
    
     println(carroMejorado3.costo())
     println(carroMejorado3.impuestos())
     println(carroMejorado3.diasEntrega())
     
     }
}