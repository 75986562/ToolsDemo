package com.hfi.web01.controller;
import com.hfi.web01.exception.MyException;
import com.hfi.web01.exception.RedisException;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MyControllerAdvice
 * @Auther VCC
 * @Date 2019/4/6 16:16
 * @Description
 * @Version 0.0.1
 */

@ControllerAdvice
public class MyControllerAdvice {
//
//    /**
//     * 应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器
//     * @param binder
//     */
//    @InitBinder
//    public void initBinder(WebDataBinder binder) {}
//
//    /**
//     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
//     * @param model
//     */
//    @ModelAttribute
//    public void addAttributes(Model model) {
//        model.addAttribute("author", "Magical Sam");
//    }
//
//    @RequestMapping("/home/ModelMap")
//    public String home(ModelMap modelMap) {
//        System.out.println(modelMap.get("author"));
//        return "ok";
//    }
//
//    //或者 通过@ModelAttribute获取
//
//    @RequestMapping("/home/ModelAttribute")
//    public String home(@ModelAttribute("author") String author) {
//        System.out.println(author);
//        return "ok";
//    }
//
//    @RequestMapping("/home/ex")
//    public String home() throws Exception {
////        throw new Exception("Sam 错误");
//        System.out.println("-------------home ex");
//        throw new MyException("101", "Sam 错误");
//
//    }

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception ex) {
        Map map = new HashMap();
        map.put("code", 100);
        map.put("msg", ex.getMessage());
        return map;
    }

    /**
     * 拦截捕捉自定义异常 MyException.class
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = MyException.class)
    public Map myErrorHandler(MyException ex) {
        Map map = new HashMap();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMsg());
        return map;
    }

    /**
     * 拦截捕捉自定义异常 RedisException.class
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = RedisException.class)
    public Map redisErrorHandler(RedisException ex) {
        Map map = new HashMap();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMsg());
        return map;
    }

}