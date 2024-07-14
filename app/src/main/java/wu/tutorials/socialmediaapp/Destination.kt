package wu.tutorials.socialmediaapp

interface Destination {
    val route: String
}
object Home:Destination {
    override val route = "Home"
}
object Pagetwo:Destination {
    override val route = "Pagetwo"
}
