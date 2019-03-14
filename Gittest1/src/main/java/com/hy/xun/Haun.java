package com.hy.xun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Date : 2019/3/14 17:31
 * @Auther:007
 * @Description:
 */
@Controller
@RequestMapping(value = "/huan")
public class Haun {

  @RequestMapping(value = "/xun.do")
  public ModelAndView Xun(){
    ModelAndView view=new ModelAndView();
    view.setViewName("/login.html");
    return view;
  }

}
