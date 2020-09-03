public class TiffCompressor implements Compressor{
  @Override
  public void compress(String fileName){
    System.out.println("Compressing " + fileName + " using TIFF");
  }
}