package cn.bdqn.component;

import cn.bdqn.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) {

        MyException exception = null;
        if(e instanceof MyException){
            exception = (MyException) e;
        }else {
            exception = new MyException("网络开小差啦...");
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("error",exception.getMessage());
        mv.setViewName("error");

        return mv;
    }
}
