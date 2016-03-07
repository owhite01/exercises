package AuxiliaryConstructors


class ClothesWasher (val modelName: String, val capacity: Double){

  def this (modelName: String) = {
    this(modelName,10)
  }

  def this(capacity: Double) = {
    this("Washer1", capacity)

  }

}