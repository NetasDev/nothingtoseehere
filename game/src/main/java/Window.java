public class Window
{
    private int width, height;
    public int[] pixels;

    public Window(int width, int height)
    {
        this.width = width;
        this.height = height;
        pixels = new int[width*height];
    }

    public void fillPixels()
    {
        for(int y = 0; y < height; y++)
        {
            for(int x = 0; x < width; x++)
            {
                pixels[x + y * width] = x*y*500;
            }
        }
    }

    public void clear()
    {
        for(int i = 0; i < pixels.length; i++)
            pixels[i] = 0;
    }
}
