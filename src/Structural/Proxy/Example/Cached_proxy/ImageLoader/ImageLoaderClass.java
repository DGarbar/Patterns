package Structural.Proxy.Example.Cached_proxy.ImageLoader;

import Structural.Proxy.Example.Cached_proxy.Object.Image;

public class ImageLoaderClass implements ImageLoader {

  @Override
  public Image getImage(String path) {
    Image image = null;
    try {
      image = load(path);
      image = render(image);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return image;
  }

  private Image render(Image image) throws InterruptedException {
    System.out.println(image.getName() + " is rendering...");

    //Mock process
    Thread.sleep(image.getSize());

    return image;
  }

  private Image load(String path) throws InterruptedException {
    //Some hard work, which need a lot of time
    //Mock process
    Thread.sleep(2000);

    Image image = new Image(path, 1000);
    System.out.println("Our image " + path + " was loaded ");
    return image;
  }
}
