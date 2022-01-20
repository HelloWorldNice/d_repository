package cn.bdqn.advice;

import cn.bdqn.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(value = {NullPointerException.class})
    public ModelAndView myExceptionToPage(Exception e){
        MyException exception = null;
        if(e instanceof MyException){
            exception = (MyException) e;
        }else {
            exception = new MyException("网络开小差啦...方式二");
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("error",exception.getMessage());
        mv.setViewName("error");

        return mv;
    }
}
