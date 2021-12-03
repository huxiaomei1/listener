package edu.xcdq.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class Demo01Listener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent event) {
        //获取ServletContext对象
        ServletContext ctx = event.getSession().getServletContext();
        //获取共享的数据
        Integer userCount = (Integer)ctx.getAttribute("userCount");
        if(null == userCount){
            userCount = new Integer(1);
        }else{
            userCount = new Integer(userCount.intValue()+1);
        }
        System.out.println("===============HttpSessionListener 人数+1============" + userCount);
        //存入共享的数据
        ctx.setAttribute("userCount", userCount);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        ServletContext ctx = event.getSession().getServletContext();
        Integer userCount = (Integer)ctx.getAttribute("userCount");
        if(null == userCount){
            userCount = new Integer(0);
        }else{
            userCount = new Integer(userCount.intValue()-1);
        }
        System.out.println("===============HttpSessionListener 人数-1============" + userCount);
        ctx.setAttribute("userCount", userCount);

    }
}
