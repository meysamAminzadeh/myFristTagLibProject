package tagsClass;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.tagext.BodyTagSupport;
import java.io.IOException;

/**
 * Created by asus on 5/21/2020.
 */
public class WelcomTag extends BodyTagSupport {


    @Override
    public int doStartTag(){
        HttpServletRequest request= (HttpServletRequest) pageContext.getRequest();
        try {
            pageContext.getOut().print(
                    request.getParameter("name")
                            +" "
                            +request.getParameter("family"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }


}
