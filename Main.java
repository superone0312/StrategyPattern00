class Main {
  public static void main(String[] args) {
    var imageStorage = new ImageStorage();
    imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
    imageStorage.store("b", new PngCompressor(), new BlackAndWhiteFilter());
    imageStorage.store("c", new TiffCompressor(), new BlackAndWhiteFilter());
    imageStorage.store("d", new TiffCompressor(), new GreenAndYellowFilter());
  }
}