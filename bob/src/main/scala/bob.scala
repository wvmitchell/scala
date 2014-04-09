import scala.util.matching.Regex

class Bob {

  def hey(statement: String) : String = {
    if(silence(statement)){
      "Fine. Be that way!"
    } else if(shouting(statement)){
      "Woah, chill out!"
    } else if(question(statement)){
      "Sure."
    } else {
      "Whatever."
    }
  }

  def silence(statement: String) : Boolean = {
    statement.trim == ""
  }

  def shouting(statement: String) : Boolean = {
    if(hasLetters(statement)){
      statement == statement.toUpperCase()
    } else {
      false
    }
  }

  def question(statement: String) : Boolean = {
    statement.endsWith("?")
  }

  def hasLetters(statement: String) : Boolean = {
    val pattern = new Regex("[a-zA-Z]")
    pattern.findAllMatchIn(statement).length > 0
  }

}
