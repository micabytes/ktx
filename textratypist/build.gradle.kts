import ktx.*

dependencies {
  api(project(":scene2d"))
  api("com.github.tommyettinger:textratypist:$textraTypistVersion")
  testImplementation("com.badlogicgames.gdx:gdx-backend-lwjgl:$gdxVersion")
  testImplementation("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")
}
