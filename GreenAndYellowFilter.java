public class GreenAndYellowFilter implements Filter{
  @Override
  public void apply(String fileName){
    System.out.println("Applying G&Y filter to " + fileName);
  }
}