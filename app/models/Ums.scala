package models

/**
 * Created with IntelliJ IDEA.
 * User: schl14
 * Date: 15.08.13
 * Time: 11:42
 * To change this template use File | Settings | File Templates.
 */
class Ums {
  var emailAddresses  = List[String]()
  var userNames  = List[String]()

  def doesEmailExist(email:String):Boolean = {
    emailAddresses.foreach(item =>
      if (item.toLowerCase() == email.toLowerCase())
      {
        return true
      }
    )
    false
  }

  def doesUsernameExist(username:String):Boolean = {
    userNames.foreach(item =>
    if(item.toLowerCase() == username.toLowerCase())
    {
      return true
    })
    false
  }
}
