class Bob {

  def hey(statement: String) : String = {
    if(shouting(statement)){
      return "Woah, chill out!"
    } else {
      return "Whatever."
    }
  }

  def shouting(statement: String) : Boolean = {
    statement == statement.toUpperCase()
  }

}
