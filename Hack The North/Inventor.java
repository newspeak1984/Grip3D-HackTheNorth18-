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
    
    public void ZoomOut(){
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
        robot.mouseWheel(-1);
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
        robot.mouseMove(1200, 250);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 220; i++){
            robot.mouseMove(1200-i, 250);
            robot.delay(2);
        }
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);
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
        robot.mouseMove(1200, 250);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 165; i++){
            robot.mouseMove(1300+i, 250);
            robot.delay(2);
        }
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);
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
        robot.mouseMove(1300, 550);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 270; i++){
            robot.mouseMove(1300-i, 550);
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
        robot.mouseMove(1300, 550);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 270; i++){
            robot.mouseMove(1300+i, 550);
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
        robot.mouseMove(1100, 250);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 135; i++){
            robot.mouseMove(1100, 250-i);
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
        robot.mouseMove(1100, 250);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        for(int i = 0; i < 135; i++){
            robot.mouseMove(1100, 250+i);
            robot.delay(1);
        }
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyRelease(KeyEvent.VK_F4);
        robot.mouseMove(initialx, initialy); 
    }
}