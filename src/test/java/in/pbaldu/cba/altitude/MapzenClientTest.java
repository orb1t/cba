package in.pbaldu.cba.altitude;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MapzenClientTest {
  MapzenClient client;

  @org.junit.Before
  public void setUp() throws Exception {
    client = new MapzenClient("DUMMY_KEY");
  }

  @Test
  public void parameters_should_generate_an_escaped_url() {
    String url = client.decodeUrl(0, 0);

    assertEquals("http://elevation.mapzen.com/height?json=%7B%22range%22:false,%22shape%22:%5B%7B%22lat%22:0.0,%22lon%22:0.0%7D%5D%7D&api_key=DUMMY_KEY", url);
  }

}