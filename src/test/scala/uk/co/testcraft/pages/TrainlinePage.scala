package uk.co.testcraft.pages

object TrainlinePage extends WebPage {

  override val url: String = "https://www.thetrainline.com/"

  def pageHeader: Query = cssSelector("h1")

  def selectOriginCity(origin: String) = {
    searchField("originStation").value=origin
  }

  def selectDestinationCity(destination: String) = {
    searchField("destinationStation").value=destination
  }

  def pressSearch() = {
    click on id("submitButton")
  }

}
