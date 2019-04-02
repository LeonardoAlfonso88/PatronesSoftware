package builder

class PlanSalud 
{
    //Atributos
    private var _tipoPlan : String = _
    private var _medicinaPrepagada : Boolean = false
    
    //Metodos
      //Getters
      def tipoPlan = _tipoPlan
      def medicinaPrepagada = _medicinaPrepagada
      
      //Setters
      def tipoPlan_(tipoPlan : String) = _tipoPlan = _tipoPlan 
      def medicinaPrepagada_(medicinaPrepagada: Boolean) = _medicinaPrepagada = medicinaPrepagada
}