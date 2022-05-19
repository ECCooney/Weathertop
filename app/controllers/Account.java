package controllers;

import models.Member;
import models.Station;
import play.Logger;
import play.mvc.Controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Account extends Controller {

  public static void index() {
    Logger.info("Rendering Member Account");
    Member member = Accounts.getLoggedInMember();
    render("account.html", member);
  }

}
