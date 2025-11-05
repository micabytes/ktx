package ktx.textratypist

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.backends.lwjgl.LwjglFiles
import com.badlogic.gdx.backends.lwjgl.LwjglNativesLoader
import com.github.tommyettinger.textra.FWSkin
import ktx.scene2d.Scene2DSkin
import org.junit.AfterClass
import org.junit.BeforeClass
import org.mockito.kotlin.mock

/**
 * Utility value for numeric tests.
 */
const val TOLERANCE = 0.0001f

/**
 * Tests that require mocked libGDX environment should inherit from this class.
 */
abstract class ApplicationTest {
  companion object {
    @JvmStatic
    @BeforeClass
    fun `initiate libGDX context`() {
      LwjglNativesLoader.load()

      Gdx.files = LwjglFiles()
      Gdx.graphics = mock()
      Gdx.gl20 = mock()
      Gdx.app = mock()
      Gdx.gl = mock()
      // Test skin with styles for textratypist widgets:
      Scene2DSkin.defaultSkin = FWSkin(Gdx.files.internal("test-skin.json"))
    }

    @JvmStatic
    @AfterClass
    fun `destroy libGDX context`() {
      Gdx.graphics = null
      Gdx.files = null
      Gdx.gl20 = null
      Gdx.app = null
      Gdx.gl = null
      Scene2DSkin.defaultSkin.dispose()
    }
  }

}
