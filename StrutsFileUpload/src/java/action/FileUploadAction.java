/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author Administrator
 */
public class FileUploadAction extends ActionSupport implements ServletRequestAware{
    private File userImage;
    private String userImageContentType;
    private String userImageFileName;
private HttpServletRequest request;
    
    
    @Override
    public String execute() throws IOException
    {
        String filepath=request.getServletContext().getRealPath("/");
        System.out.println("Path= "+filepath);
        File f= new File(filepath, userImageFileName);
        FileUtils.copyFile(userImage, f);
        return "success";
    }
    public File getUserImage() {
        return userImage;
    }

    public void setUserImage(File userImage) {
        this.userImage = userImage;
    }

    public String getUserImageContentType() {
        return userImageContentType;
    }

    public void setUserImageContentType(String userImageContentType) {
        this.userImageContentType = userImageContentType;
    }

    public String getUserImageFileName() {
        return userImageFileName;
    }

    public void setUserImageFileName(String userImageFileName) {
        this.userImageFileName = userImageFileName;
    }

    @Override
    public void setServletRequest(HttpServletRequest hsr) {
        request=hsr;
    }

   
    
}
