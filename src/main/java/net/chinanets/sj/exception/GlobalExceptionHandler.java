package net.chinanets.sj.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

//@ControllerAdvice(annotations=RestController.class)
//@ControllerAdvice(basePackages={"com.xxx","com.ooo"})
@ControllerAdvice
//如果返回的为json数据或其它对象，添加该注解  
@ResponseBody
public class GlobalExceptionHandler {

    //    @ExceptionHandler(value={RuntimeException.class,MyRuntimeException.class})
//        @ExceptionHandler//处理所有异常
    //添加全局异常处理流程，根据需要设置需要处理的异常，NullPointerException
    @ExceptionHandler(value = {NullPointerException.class, ArithmeticException.class})
    public ModelAndView NullPointerException(HttpServletRequest request, Exception exception) throws Exception {

        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", exception);
        mv.addObject("url", request.getRequestURL());
        mv.setViewName("error");

        return mv;
    }
}