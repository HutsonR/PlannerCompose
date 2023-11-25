package basic.daily.plannercompose

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Главная")
    object Target : NavigationItem("target", R.drawable.ic_target, "Цели")
    object Profile : NavigationItem("profile", R.drawable.ic_user, "Профиль")
}