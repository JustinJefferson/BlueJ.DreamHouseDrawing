
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;
    
    // My dream house objects
    // The House
    private Triangle roofing;
    private Square bottomWall;
    private Square middleWall;
    private Triangle topWall;
    private Square windowHole;
    private Square windowPanel1;
    private Square windowPanel2;
    private Square windowPanel3;
    private Square windowPanel4;
    private Square doorTop;
    private Square doorBottom;
    private Circle doorKnob;
    
    //The Foreground
    private Triangle foreground;
    
    //The Backgrougd
    private Triangle background;
    
    //The Tree
    private Triangle treeTrunk;
    private Triangle treeBranch1;
    private Triangle treeBranch2;
    private Circle leavesBack1;
    private Circle leavesBack2;
    private Circle leavesFront1;
    private Circle leavesFront2;
    private Circle leavesFront3;
    private Circle leavesFront4;
    

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        // Call my dream house objects
        // Note: Squares and Circles draw point is top left corner
        // Note: Triangle draw point is top middle
        
        // Background
        background = new Triangle();
        background.changeColor("yellow");
        background.changeSize(200,1500);
        background.moveHorizontal(300);
        background.moveVertical(150);
        background.makeVisible();
        
        // Tree
        leavesBack1 = new Circle();
        leavesBack1.changeColor("black");
        leavesBack1.changeSize(60);
        leavesBack1.moveHorizontal(70);
        leavesBack1.moveVertical(45);
        leavesBack1.makeVisible();
        
        leavesBack2 = new Circle();
        leavesBack2.changeColor("black");
        leavesBack2.changeSize(125);
        leavesBack2.moveHorizontal(-35);
        leavesBack2.moveVertical(25);
        leavesBack2.makeVisible();
        
        treeTrunk = new Triangle();
        treeTrunk.changeColor("red");
        treeTrunk.changeSize(200,50);
        treeTrunk.moveHorizontal(50);
        treeTrunk.moveVertical(50);
        treeTrunk.makeVisible();
        
        treeBranch1 = new Triangle();
        treeBranch1.changeColor("red");
        treeBranch1.changeSize(10,75);
        treeBranch1.moveHorizontal(75);
        treeBranch1.moveVertical(125);
        treeBranch1.makeVisible();
        
        treeBranch2 = new Triangle();
        treeBranch2.changeColor("red");
        treeBranch2.changeSize(60,10);
        treeBranch2.moveHorizontal(100);
        treeBranch2.moveVertical(75);
        treeBranch2.makeVisible();
        
        leavesFront1 = new Circle();
        leavesFront1.changeColor("black");
        leavesFront1.changeSize(100);
        leavesFront1.moveHorizontal(20);
        leavesFront1.moveVertical(0);
        leavesFront1.makeVisible();
        
        leavesFront2 = new Circle();
        leavesFront2.changeColor("black");
        leavesFront2.changeSize(30);
        leavesFront2.moveHorizontal(115);
        leavesFront2.moveVertical(65);
        leavesFront2.makeVisible();
        
        leavesFront3 = new Circle();
        leavesFront3.changeColor("black");
        leavesFront3.changeSize(35);
        leavesFront3.moveHorizontal(50);
        leavesFront3.moveVertical(115);
        leavesFront3.makeVisible();
        
        // House
        roofing = new Triangle();
        roofing.changeColor("black");
        roofing.changeSize(60,110);
        roofing.moveHorizontal(200);
        roofing.moveVertical(50);
        roofing.makeVisible();
        
        topWall = new Triangle();
        topWall.changeColor("red");
        topWall.changeSize(50,100);
        topWall.moveHorizontal(200);
        topWall.moveVertical(60);
        topWall.makeVisible();
        
        middleWall = new Square();
        middleWall.changeSize(100);
        middleWall.moveHorizontal(150);
        middleWall.moveVertical(110);
        middleWall.makeVisible();
        
        bottomWall = new Square();
        bottomWall.changeSize(100);
        bottomWall.moveHorizontal(150);
        bottomWall.moveVertical(130);
        bottomWall.makeVisible();
        
        windowHole = new Square();
        windowHole.changeColor("black");
        windowHole.changeSize(50);
        windowHole.moveHorizontal(175);
        windowHole.moveVertical(100);
        windowHole.makeVisible();
        
        windowPanel1 = new Square();
        windowPanel1.changeColor("yellow");
        windowPanel1.changeSize(15);
        windowPanel1.moveHorizontal(180);
        windowPanel1.moveVertical(105);
        windowPanel1.makeVisible();
        
        windowPanel2 = new Square();
        windowPanel2.changeColor("yellow");
        windowPanel2.changeSize(15);
        windowPanel2.moveHorizontal(180);
        windowPanel2.moveVertical(130);
        windowPanel2.makeVisible();
        
        windowPanel3 = new Square();
        windowPanel3.changeColor("yellow");
        windowPanel3.changeSize(15);
        windowPanel3.moveHorizontal(205);
        windowPanel3.moveVertical(105);
        windowPanel3.makeVisible();
        
        windowPanel4 = new Square();
        windowPanel4.changeColor("yellow");
        windowPanel4.changeSize(15);
        windowPanel4.moveHorizontal(205);
        windowPanel4.moveVertical(130);
        windowPanel4.makeVisible();
        
        doorTop = new Square();
        doorTop.changeColor("black");
        doorTop.changeSize(25);
        doorTop.moveHorizontal(200);
        doorTop.moveVertical(180);
        doorTop.makeVisible();
        
        doorBottom = new Square();
        doorBottom.changeColor("black");
        doorBottom.changeSize(25);
        doorBottom.moveHorizontal(200);
        doorBottom.moveVertical(205);
        doorBottom.makeVisible();
        
        doorKnob = new Circle();
        doorKnob.changeColor("yellow");
        doorKnob.changeSize(5);
        doorKnob.moveHorizontal(205);
        doorKnob.moveVertical(205);
        doorKnob.makeVisible();
        
        foreground = new Triangle();
        foreground.changeColor("yellow");
        foreground.changeSize(150,1000);
        foreground.moveVertical(175);
        foreground.makeVisible();
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
