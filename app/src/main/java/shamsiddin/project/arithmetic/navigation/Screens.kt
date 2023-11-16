package shamsiddin.project.arithmetic.navigation


sealed class Screens(val route: String) {
    object NewActivity: Screens("new_activity_screen")
    object Records: Screens("records_screen")

    object MainActivity : Screens("main_activity_screen")

}