package com.test.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import java.io.*;
import java.util.List;

/**
 * Created by Administrator on 2015/3/21 0021.
 */

public class UploadServlet extends javax.servlet.http.HttpServlet {
    @SuppressWarnings("unchecked")
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        DiskFileItemFactory factory = new DiskFileItemFactory() ;
        String path = getServletContext().getRealPath("/upload") ;
        factory.setRepository(new File(path));
        factory.setSizeThreshold(1024*1024);
        ServletFileUpload upload = new ServletFileUpload(factory) ;
        //fileupload上传文件乱码只需设置头部编码就可以了!
        upload.setHeaderEncoding("utf-8");
        try {
            List<FileItem> list = upload.parseRequest(request);
            for(FileItem item : list) {
                if (item.isFormField()) {
                    String name = item.getFieldName();
                    String value = item.getString("utf-8");
                    request.setAttribute(name, value);
                } else {
                    String name = item.getFieldName();
                    String value = item.getName();
                    int start = value.lastIndexOf("\\");
                    String fileName = value.substring(start + 1);
                    request.setAttribute(name, fileName);
                    item.write(new File(path,fileName));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        request.getRequestDispatcher("upload/result2.jsp").forward(request,response);
    }
}
