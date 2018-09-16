 import java.awt.*;
 import java.awt.AWTException;
 import java.io.IOException;
 import java.awt.event.InputEvent;
 import java.awt.MouseInfo;
public class testing
{
    public static void testing()
    {
        for (int i =0; i >= 0; i++){
        Point a = MouseInfo.getPointerInfo().getLocation();     
        int x = (int) a.getX();
        int y = (int) a.getY();
        System.out.println(x);
    }
    }
}
