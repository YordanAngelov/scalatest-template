package uk.co.testcraft.tests

import org.scalatest.selenium.WebBrowser
import uk.co.testcraft.pages.{TimetablePage, TrainlinePage, WebPage}

class TrainlineSpec extends BaseFeatureSpec with WebBrowser with WebPage {

//  feature("Gov UK main page") {
//
//    scenario("Navigate to the gov.uk homepage", SmokeTest) {
//
//      When("I navigate to the gov.uk homepage")
//      GovUkPage.goToPage()
//
//      Then("the gov.uk page should be loaded")
//      GovUkPage.pageHeader.element.text shouldBe "Welcome to GOV.UK"
//    }
//
//  }

  feature("The Trainline main page") {

    scenario("Navigate to the Trainline main page"){

      When("I navigate to the Trainline main page")
      TrainlinePage.goToPage()

      Then("The Trainline main page should be loaded")
      TrainlinePage.pageHeader.element.text should include ("tickets")
    }

    scenario("Searching for a single ticket"){

      Given("I navigate to the Trainline main page")
      TrainlinePage.goToPage()

      When("I search for trains from Brighton to London")
      TrainlinePage.selectOriginCity("Brighton")
      TrainlinePage.selectDestinationCity("London")
      TrainlinePage.pressSearch()

      Then("I should see results")
      TimetablePage.checkResults("Brighton")
    }

  }

}
