package org.robolectric.shadows;

import android.graphics.Picture;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.TestRunners;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(TestRunners.MultiApiSelfTest.class)
public class ShadowPictureTest {

  @Test
  public void beginRecordingSetsHeightAndWidth() {
    Picture picture = new Picture();
    picture.beginRecording(100, 100);
    assertThat(picture.getHeight()).isEqualTo(100);
    assertThat(picture.getWidth()).isEqualTo(100);
  }

  @Test
  public void copyConstructor() {
    Picture originalPicture = new Picture();
    originalPicture.beginRecording(100, 100);

    Picture copiedPicture = new Picture(originalPicture);
    assertThat(copiedPicture.getHeight()).isEqualTo(100);
    assertThat(copiedPicture.getWidth()).isEqualTo(100);
  }
}
