package tagsClass;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

/**
 * Created by asus on 5/21/2020.
 */
public class FirstTag extends BodyTagSupport {

    @Override
    public int doStartTag() {

        try {
            pageContext.getOut().print("salam man avvalin tag hastam");
            // out.print("salam man avvalin tag hastam");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}
