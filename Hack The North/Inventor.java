import java.awt.*;
import java.awt.AWTException;
import java.io.IOException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
public class Inventor{
    private AutoClick autoClick;
    private Runtime runtime;
    private Robot robot;
    public void ZoomIn(){
        try{
            robot = new Robot();
        } catch (AWTException e){
            e.printStackTrace();
        }
        robot.delay(2000);
        Point a = MouseInfo.getPointerInfo().getLocation();     
        int initialx = (int) a.getX();
        int initialy = (int) a.getY();
        robot.mouseMove(1000, 550);
        robot.mouseWheel(1);
        robot.mouseMove(initialx, initialy);
    }

    public void Rotate90CCWZ(){  
        try{
            robot = new Robot();
        } catch (AWTException e){
            e.printStackTrace();
        }
        robot.delay(2000);
        Point a = MouseInfo.getPointerInfo().getLocation();     
        int initialx = (int) a.getX();
        int initialy = (int) a.getY();
        //move
        robot.keyPress(KeyEvent.VK_F4);
        robot.mouseMove(735, 207);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 350; i++){
            robot.mouseMove(735-i, 207+i);
            robot.delay(1);
        }
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.mouseMove(initialx, initialy); 
    }

    public void Rotate90CWZ(){  
        try{
            robot = new Robot();
        } catch (AWTException e){
            e.printStackTrace();
        }
        robot.delay(2000);
        Point a = MouseInfo.getPointerInfo().getLocation();     
        int initialx = (int) a.getX();
        int initialy = (int) a.getY();
        //move
        robot.keyPress(KeyEvent.VK_F4);
        robot.mouseMove(735, 207);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 250; i++){
            robot.mouseMove(735+i, 207+i);
            robot.delay(1);
        }
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.mouseMove(initialx, initialy); 
    }

    public void Rotate90CWY(){  
        try{
            robot = new Robot();
        } catch (AWTException e){
            e.printStackTrace();
        }
        robot.delay(2000);
        Point a = MouseInfo.getPointerInfo().getLocation();     
        int initialx = (int) a.getX();
        int initialy = (int) a.getY();
        //move
        robot.keyPress(KeyEvent.VK_F4);
        robot.mouseMove(590, 418);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 270; i++){
            robot.mouseMove(590-i, 418);
            robot.delay(1);
        }
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.mouseMove(initialx, initialy); 
    }

    public void Rotate90CCWY(){  
        try{
            robot = new Robot();
        } catch (AWTException e){
            e.printStackTrace();
        }
        robot.delay(2000);
        Point a = MouseInfo.getPointerInfo().getLocation();     
        int initialx = (int) a.getX();
        int initialy = (int) a.getY();
        //move
        robot.keyPress(KeyEvent.VK_F4);
        robot.mouseMove(590, 418);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 270; i++){
            robot.mouseMove(590+i, 418);
            robot.delay(1);
        }
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.mouseMove(initialx, initialy); 
    }

    public void Rotate90CWX(){  
        try{
            robot = new Robot();
        } catch (AWTException e){
            e.printStackTrace();
        }
        robot.delay(2000);
        Point a = MouseInfo.getPointerInfo().getLocation();     
        int initialx = (int) a.getX();
        int initialy = (int) a.getY();
        //move
        robot.keyPress(KeyEvent.VK_F4);
        robot.mouseMove(802, 207);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 135; i++){
            robot.mouseMove(802, 207-i);
            robot.delay(1);
        }
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.mouseMove(initialx, initialy); 
    }

    public void Rotate90CCWX(){  
        try{
            robot = new Robot();
        } catch (AWTException e){
            e.printStackTrace();
        }
        robot.delay(2000);
        Point a = MouseInfo.getPointerInfo().getLocation();     
        int initialx = (int) a.getX();
        int initialy = (int) a.getY();
        //move
        robot.keyPress(KeyEvent.VK_F4);
        robot.mouseMove(802, 207);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 135; i++){
            robot.mouseMove(802, 207+i);
            robot.delay(1);
        }
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.mouseMove(initialx, initialy); 
    }
}