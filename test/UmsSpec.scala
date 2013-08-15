package test

import org.specs2.mutable._
import play.api.test._
import play.api.test.Helpers._
import models.Ums

/**
 * Created with IntelliJ IDEA.
 * User: schl14
 * Date: 15.08.13
 * Time: 11:44
 * To change this template use File | Settings | File Templates.
 */
class UmsSpec extends Specification {
  "Ums" should {
    "recognize existing email addresses" in {
      val ums = new Ums()
      val email = "john@google.com"
      ums.emailAddresses = List[String]{email}
      ums.doesEmailExist(email) must beTrue
    }
    "independant of their casing" in {
      val ums = new Ums()
      val email = "JOHN@google.com"
      ums.emailAddresses = List[String]{"john@google.com"}
      ums.doesEmailExist(email) must beTrue
    }
    "recognize existing usernames" in {
      val ums = new Ums();
      val username = "john"
      ums.userNames = List[String]{username}
      ums.doesUsernameExist(username) must beTrue
    }
    "independant of their casing" in {
      val ums = new Ums();
      val username = "JOHN"
      ums.userNames = List[String]{"john"}
      ums.doesUsernameExist(username) must beTrue
    }
  }
}
