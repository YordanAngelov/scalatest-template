package uk.co.testcraft.pages

object TimetablePage extends WebPage {

  override val url: String = "https://www.thetrainline.com/"

  def timetable: Query = cssSelector("matrix-header clearfix hidden-xs")

   def checkResults(check: String) = {
     timetable.element.text should include (check)
  }

}
