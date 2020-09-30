package tagsClass;

import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

/**
 * Created by asus on 5/21/2020.
 */
public class Sum extends BodyTagSupport {

    private int num1,num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public int doStartTag(){

        try {
            pageContext.getOut().println(" num1= "+ this.getNum1() +"  num2= "+this.getNum2() );
            pageContext.getOut().println(" sum (num1 + num2) = "+ (this.getNum1() + this.getNum2()) );

        } catch (IOException e) {
            e.printStackTrace();
        }

       // return SKIP_BODY;
        return EVAL_BODY_INCLUDE;
    }

    public int doAfterBody(){
        try {
            pageContext.getOut().print("bye");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
