package decorator

abstract class CarroDecorator(carroBase : Carro) extends Carro
{
    protected var _carro : Carro = carroBase
}