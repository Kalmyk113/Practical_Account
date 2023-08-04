import acm.graphics.GCanvas;
import acm.graphics.GImage;
import acm.graphics.GLabel;

public class AccountCanvas extends GCanvas {

    private static final int TEXT_HEIGHT = 30;   // you can modify this to suit your ascii art
    private static final int TEXT_X_OFFSET = 20;   // you can modify this to suit your ascii art
    private int textX;
    private int textY;
    // Image size 128x128
    private static final int profileX = 128;
    private static final int ProfileY = 128;

    public void displayAccount(String name, int age, int access){
        GLabel namelabel = new GLabel(name);
        GLabel agelabel = new GLabel("\tAge: "+age);
        GLabel accesslabel;
        switch(access) {
            case 0:
                accesslabel = new GLabel("User Access");
                break;
            case 1:
                accesslabel = new GLabel("Owner Access");
                break;
            case 2:
               accesslabel = new GLabel("Admin Access");
                break;
            default:
                accesslabel = new GLabel("Access Unknown");
                break;
        }

        namelabel.setFont("Times New Roman-30");
        agelabel.setFont("Times New Roman-25");
        accesslabel.setFont("Times New Roman-25");

        GImage profile = new GImage("people.png");

        textX = TEXT_X_OFFSET+profileX;
        textY = TEXT_HEIGHT;

        add(profile,10,10);

        add(namelabel,textX,textY);
        textY += TEXT_HEIGHT;
        add(agelabel,textX, textY);
        textY += TEXT_HEIGHT;
        add(accesslabel,textX, textY);
    }

    public void displayAccount(int none){
        if(none<0){
            textX = TEXT_X_OFFSET;
            textY = TEXT_HEIGHT;
            GLabel label = new GLabel("Account Name or Password incorrect \n OR \n Account doesn't exist");
            label.setFont("Times New Roman-25");
            add(label, TEXT_X_OFFSET, TEXT_HEIGHT);
        }
    }

    public void endProgram(){
        textX = TEXT_X_OFFSET;
        textY = TEXT_HEIGHT;
        GLabel bye = new GLabel("Goodbye!");
        bye.setFont("Times New Roman-25");
        add(bye, TEXT_X_OFFSET, TEXT_HEIGHT);
    }

    //public void reset() {
    }
}
